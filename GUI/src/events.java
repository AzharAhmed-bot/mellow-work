import javax.swing.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class events {
    String buttonText;

    public events(String buttonText) {
        this.buttonText = buttonText;
    }

    public void saveData(String username, String password) throws InterruptedException {
        System.out.println("Posting credentials...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Welcome " + username + " to your profile");
    }

    public void registerData(String name, String email) throws InterruptedException {
        System.out.println("Registering user...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Welcome " + name + " Check your email " + email + " for confirmation");
    }

    // Method to clear all input fields
    public void clearInput(JTextField tf1, JTextField tf2, JPasswordField p1, JPasswordField p2,
                           JTextField tf5, JTextField tf6, JTextField tf7,
                           Checkbox radio1, Checkbox radio2,
                           Checkbox option1, Checkbox option2, Checkbox option3) {
        System.out.println("Clearing input field...");
        tf1.setText(""); 
        tf2.setText(""); 
        p1.setText(""); 
        p2.setText("");  
        tf5.setText("");
        tf6.setText("");
        tf7.setText(""); 

        // Reset radio buttons
        radio1.setState(false);
        radio2.setState(true);

        // Reset checkbox options
        option1.setState(false);
        option2.setState(false);
        option3.setState(false);
    }
}
