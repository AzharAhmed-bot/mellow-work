import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
        

        String firstNum=JOptionPane.showInputDialog("Enter first number: ");
        String secNum=JOptionPane.showInputDialog("Enter second number: ");

        int sum= Integer.parseInt(firstNum) * Integer.parseInt(secNum);

        JOptionPane.showMessageDialog(null,"The multiplication is:"+sum,"The multiplication of 2 numbers",JOptionPane.PLAIN_MESSAGE);


    }
}