import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {

    public Home() {
        // Create the main frame
        setTitle("My Home Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Create the main panel with a BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.decode("#f5f5f5"));

        // Create a header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.decode("#3f51b5"));
        JLabel titleLabel = new JLabel("Welcome to My Application", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        headerPanel.add(titleLabel);

        // Create a button panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 20, 20));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        buttonPanel.setBackground(Color.decode("#f5f5f5"));

        // Create buttons with actions
        JButton dashboardButton = new JButton("Dashboard");
        dashboardButton.setFont(new Font("Arial", Font.PLAIN, 20));
        dashboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Home.this, "Dashboard Clicked!");
            }
        });

        JButton profileButton = new JButton("Profile");
        profileButton.setFont(new Font("Arial", Font.PLAIN, 20));
        profileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Home.this, "Profile Clicked!");
            }
        });

        JButton settingsButton = new JButton("Settings");
        settingsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Home.this, "Settings Clicked!");
            }
        });

        // Add buttons to the button panel
        buttonPanel.add(dashboardButton);
        buttonPanel.add(profileButton);
        buttonPanel.add(settingsButton);

        // Add panels to the main panel
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Add main panel to the frame
        add(mainPanel);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Home home = new Home();
            home.setVisible(true);
        });
    }
}
