
package swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGrid extends JFrame {
    private JButton[] btnNumbers = new JButton[10];
    private JButton btnDelete;
    private JButton btnReset;
    private JTextField tfDisplay = new JTextField();

    public NumberGrid() {
        this.tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        this.addButtons(panelButtons);
        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(this.tfDisplay, "North");
        cp.add(panelButtons, "Center");
        this.setDefaultCloseOperation(3);
        this.setTitle("Number Grid");
        this.setSize(200, 200);
        this.setVisible(true);
    }

    void addButtons(JPanel panelButtons) {
        ButtonListener btnListener = new ButtonListener();

        for(int i = 1; i <= 9; ++i) {
            this.btnNumbers[i] = new JButton("" + i);
            panelButtons.add(this.btnNumbers[i]);
            this.btnNumbers[i].addActionListener(btnListener);
        }

        this.btnDelete = new JButton("DEL");
        panelButtons.add(this.btnDelete);
        this.btnDelete.addActionListener(btnListener);
        this.btnNumbers[0] = new JButton("0");
        panelButtons.add(this.btnNumbers[0]);
        this.btnNumbers[0].addActionListener(btnListener);
        this.btnReset = new JButton("C");
        panelButtons.add(this.btnReset);
        this.btnReset.addActionListener(btnListener);
    }

    public static void main(String[] args) {
        new NumberGrid();
    }

    private class ButtonListener implements ActionListener {
        private ButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
                tfDisplay.setText(tfDisplay.getText() + button);
            } else if (button.equals("DEL")) {
                tfDisplay.setText(tfDisplay.getText().substring(0, tfDisplay.getText().length() - 1));
            } else {
                tfDisplay.setText("");
            }

        }
    }
}
