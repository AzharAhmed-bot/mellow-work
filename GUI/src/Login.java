import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
    public Login() {
        // Frame configuration
        super("Login");
        setSize(400, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    
        // Panel
        JPanel panel = new JPanel(new BorderLayout());
    
        // Email Text
        JLabel emailLabel = new JLabel("E-mail Address");
        panel.add(emailLabel, BorderLayout.NORTH); 
    
        JTextField emailField = new JTextField(20);
        panel.add(emailField, BorderLayout.CENTER); 
    
        // Add the panel to the frame
        setContentPane(panel);
    }
    

    public static void main(String[] args) {
        new Login();
    }
}