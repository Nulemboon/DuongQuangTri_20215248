package Screen;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import Cart.Cart;
import Media.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class CartScreenController {
    private Cart cart;
    @FXML
    private TableView<Media> tblMedia;
    @FXML
    private TableColumn<Media, String> colMediaTitle;
    @FXML
    private TableColumn<Media, String>  colMediaCategory;
    @FXML
    private TableColumn<Media, Float> colMediaCost;
    @FXML
    private Button btnPlay, btnRemove;
    @FXML
    private TextField tfFilter;
    @FXML
    private RadioButton radioBtnFilterId, radioBtnFilterTitle;
    @FXML
    private Button btnPlaceOrder;
    @FXML
    private Label priceLb;
    @FXML
    private MenuItem mnAddBook;
    @FXML
    private MenuItem mnAddCD;
    @FXML
    private MenuItem mnAddDVD;
    @FXML
    private MenuItem mnViewCart;
    @FXML
    private MenuItem mnViewStore;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));

        tblMedia.setItems(this.cart.getItemsOrdered());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<Media>() {
                    @Override
                    public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                        if (newValue != null) {
                            updateButtonBar(newValue);
                        }
                    }
                }
        );

        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                showFilterMedia(newValue);
            }
        });

        updatePriceLabel();
    }

    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if (media instanceof Playable) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
    }

    void showFilterMedia(String str) {
        ObservableList<Media> items = cart.getItemsOrdered();
        FilteredList<Media> filteredItems = new FilteredList<>(items, m -> true);

        if (str != null && !str.isEmpty()) {
            if (radioBtnFilterId.isSelected()) {
                filteredItems.setPredicate(m -> cart.searchCart(Integer.parseInt(str)));
            } else if (radioBtnFilterTitle.isSelected()) {
                filteredItems.setPredicate(m -> cart.searchCart(str.toLowerCase()));
            }
        }

        tblMedia.setItems(filteredItems);
    }
    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
    }

    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {
        if (cart.getItemsOrdered().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Your cart is empty!");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Ordered Successfully!");
        alert.showAndWait();

        cart = new Cart();
        tblMedia.getItems().clear();
    }

    @FXML
    void btnPlayPressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        if (media != null && media instanceof Playable) {
            media.play();
            Stage playerStage = new Stage();
            playerStage.setTitle(media.getTitle());

            // Create a Label to display the "Playing" message
            Label playingLabel = new Label("Playing " + media.getTitle());
            playingLabel.setFont(Font.font("System", FontWeight.BOLD, 14));
            playingLabel.setTextFill(Color.WHITE);

            // Create a BorderPane to hold the Label
            BorderPane root = new BorderPane();
            root.setStyle("-fx-background-color: black;");
            root.setCenter(playingLabel);

            // Create a Scene to hold the BorderPane
            Scene mediaScene = new Scene(root, 640, 50);

            // Set the Scene in the Stage and show it
            playerStage.setScene(mediaScene);
            playerStage.show();

            // Start playing the media
            media.play();

        }
    }

    void updatePriceLabel() {
        priceLb.setText(String.format("%.2f", cart.totalCost()) + " $");
    }


}
