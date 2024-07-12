import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JTextField tf1, tf2, tf5, tf6, tf7;
    JButton btn1, btn2;
    JPasswordField p1, p2;
    CheckboxGroup radioGroup;
    Checkbox radio1, radio2;
    Checkbox option1, option2, option3;

    public Registration() {
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Form");

        l1 = new JLabel("Registration Form:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Email-ID:");
        l4 = new JLabel("Create Password:");
        l5 = new JLabel("Confirm Password:");
        l6 = new JLabel("Country:");
        l7 = new JLabel("State:");
        l8 = new JLabel("Phone No:");
        l9 = new JLabel("Gender:");
        l10 = new JLabel("Course:");
        tf1 = new JTextField();
        tf2 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        radioGroup = new CheckboxGroup();
        radio1 = new Checkbox("Male", radioGroup, false);
        radio2 = new Checkbox("Female", radioGroup, true);
        option1 = new Checkbox("Course 1", false);
        option2 = new Checkbox("Course 2", false);
        option3 = new Checkbox("Course 3", false);

        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        l1.setBounds(250, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30);
        l9.setBounds(80, 350, 200, 30);
        l10.setBounds(80, 390, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 150, 200, 30);
        p2.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        btn1.setBounds(250, 450, 100, 30);
        btn2.setBounds(370, 450, 100, 30);
        radio1.setBounds(300, 350, 100, 30);
        radio2.setBounds(400, 350, 100, 30);
        option1.setBounds(300, 390, 100, 30);
        option2.setBounds(400, 390, 100, 30);
        option3.setBounds(500, 390, 100, 30);

        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(p1);
        add(l5);
        add(p2);
        add(l6);
        add(tf5);
        add(l7);
        add(tf6);
        add(l8);
        add(tf7);
        add(btn1);
        add(btn2);
        add(l9);
        add(radio1);
        add(radio2);
        add(l10);
        add(option1);
        add(option2);
        add(option3);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Registration registration = new Registration();
            registration.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            // Assuming registration is successful, navigate to Login page
            SwingUtilities.invokeLater(() -> {
                Login login = new Login();
                login.setVisible(true);
            });
            this.setVisible(false);
        } else if (e.getSource() == btn2) {
            tf1.setText("");
            tf2.setText("");
            p1.setText("");
            p2.setText("");
            tf5.setText("");
            tf6.setText("");
            tf7.setText("");
            radioGroup.setSelectedCheckbox(null);
            option1.setState(false);
            option2.setState(false);
            option3.setState(false);
        }
    }
}
