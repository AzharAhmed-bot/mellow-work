import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class App extends JFrame implements ActionListener {

    private JTextField Fname, Lname;
    private JButton submit;
    private JLabel messaage;
    
    public App(){
        super("Registration");
        setLayout(new FlowLayout());
        messaage=new JLabel("Entet Name");
        add(messaage);
        Fname=new JTextField(15);
        add(Fname);
        Lname=new JTextField(15);
        add(Lname);
        submit=new JButton("Submit");
        submit.addActionListener((ActionListener) this);
        add(submit);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==submit){
            String fname=Fname.getText();
            String lname=Lname.getText();
            messaage.setText("Welcome: "+fname+" "+lname);
            JOptionPane.showMessageDialog(null,"Registration complete","Success",JOptionPane.PLAIN_MESSAGE);


        }
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        // Set properties of the JFrame
        app.setSize(300, 400); // Set size of the frame
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        app.setLocationRelativeTo(null); // Center the frame on the screen
        app.setVisible(true); // Make the frame visible
    }
}
