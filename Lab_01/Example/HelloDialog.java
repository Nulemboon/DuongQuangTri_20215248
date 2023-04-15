
import javax.swing.JOptionPane;
public class HelloDialog {
    public static void main (String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please input your name:");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
    }
}
