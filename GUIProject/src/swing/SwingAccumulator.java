package swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingAccumulator extends JFrame {
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0;

    public SwingAccumulator() {
        Container cp = this.getContentPane();
        cp.setLayout(new GridLayout(2, 2));
        cp.add(new JLabel("Enter an Integer"));
        this.tfInput = new JTextField(10);
        cp.add(this.tfInput);
        this.tfInput.addActionListener(new TFInputListener());
        cp.add(new JLabel("The Accumulated Sum is: "));
        this.tfOutput = new JTextField(10);
        this.tfOutput.setEditable(false);
        cp.add(this.tfOutput);
        this.setTitle("Swing Accumulator");
        this.setSize(350, 120);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAccumulator();
    }

    private class TFInputListener implements ActionListener {
        private TFInputListener() {
        }

        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(SwingAccumulator.this.tfInput.getText());
            sum += numberIn;
            SwingAccumulator.this.tfInput.setText("");
            SwingAccumulator.this.tfOutput.setText("" + SwingAccumulator.this.sum);
        }
    }
}
