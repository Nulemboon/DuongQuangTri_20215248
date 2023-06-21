
package swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;

    public AWTAccumulator() {
        this.setLayout(new GridLayout(2, 2));
        this.add(new Label("Enter an Interger: "));
        this.tfInput = new TextField(10);
        this.add(this.tfInput);
        this.tfInput.addActionListener(new TFInputListener());
        this.add(new Label("The Accumulated Sum is: "));
        this.tfOutput = new TextField(10);
        this.tfOutput.setEditable(false);
        this.add(this.tfOutput);
        this.setTitle("AWT Accumulator");
        this.setSize(350, 120);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTAccumulator();
    }

    private class TFInputListener implements ActionListener {
        private TFInputListener() {
        }

        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(AWTAccumulator.this.tfInput.getText());
            AWTAccumulator var10000 = AWTAccumulator.this;
            var10000.sum += numberIn;
            AWTAccumulator.this.tfInput.setText("");
            AWTAccumulator.this.tfOutput.setText("" + AWTAccumulator.this.sum);
        }
    }
}
