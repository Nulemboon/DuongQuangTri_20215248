import javax.swing.JOptionPane;

public class ComputeTwoNumbers {
    public static void main (String[] args) {
        String num1, num2;
        String notifi = "You have just entered: ";
        num1 = JOptionPane.showInputDialog(null, "Please input the first number: " , "Input the first number: ", JOptionPane.INFORMATION_MESSAGE);
        notifi += num1 + " and ";
        double n1 = Double.parseDouble(num1);
        num2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number: ", JOptionPane.INFORMATION_MESSAGE);
        notifi += num2;
        double n2 = Double.parseDouble(num2);
        JOptionPane.showMessageDialog(null, notifi, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        String sum = "Sum = " + (n1 + n2);
        JOptionPane.showMessageDialog(null, sum, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        String diff = "Difference = " + (n1 - n2);
        JOptionPane.showMessageDialog(null, diff, "Difference between two numbers", JOptionPane.INFORMATION_MESSAGE);
        String multi = "Product = " + (n1 * n2);
        JOptionPane.showMessageDialog(null, multi, "Product of two numbers", JOptionPane.INFORMATION_MESSAGE);
        String div = "Quotient = ";
        if (n2 == 0) {
            JOptionPane.showMessageDialog(null, "Infinite", "Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
        } else {
            div = div + (n1 / n2);
            JOptionPane.showMessageDialog(null, div, "Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}