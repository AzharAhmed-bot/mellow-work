import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class App extends JFrame {
    private JTextField textFName, textLName;
    private JLabel label;
    private JButton button;

    public App() {
        super("Register");
        setLayout(new FlowLayout());

        label = new JLabel("Enter names");
        add(label);
        textFName = new JTextField(10);
        add(textFName);
        textLName = new JTextField(10);
        add(textLName);
        button = new JButton("Register");
        add(button);
    }

    public static void main(String[] args) {
        App app = new App();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(800, 900);
        app.setVisible(true);
    }
}
