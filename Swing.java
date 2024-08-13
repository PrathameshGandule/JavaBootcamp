import javax.swing.*;
import java.awt.*;
 
public class Swing extends JFrame {
    Swing() {
        // Setting the layout manager to null
        setLayout(null);
 
        // Setting the background color of the window
        getContentPane().setBackground(Color.lightGray); // Use getContentPane() for setting background color
 
        // Creating the components
        JLabel l1 = new JLabel("Username:");
        JTextField t1 = new JTextField("Firstname", 20);
        JLabel l2 = new JLabel("Lastname:");
        JTextField t2 = new JTextField("Lastname", 20);
        JLabel l3 = new JLabel("Mobile Number:");
        JTextField t3 = new JTextField("Number", 30);
        JLabel l4 = new JLabel("Email:");
        JTextField t4 = new JTextField("Email", 30);
        JButton b = new JButton("Click me");
        JCheckBox c1 = new JCheckBox("Male");
        JCheckBox c2 = new JCheckBox("Female");
        JScrollPane sc = new JScrollPane();
 
        // Setting the bounds for each component
        l1.setBounds(30, 50, 100, 30);
        t1.setBounds(150, 50, 200, 30);
        l2.setBounds(30, 100, 100, 30);
        t2.setBounds(150, 100, 200, 30);
        c1.setBounds(150, 140, 100, 30);
        c2.setBounds(150, 165, 100, 30);
        l3.setBounds(30, 200, 100, 30);
        t3.setBounds(150, 200, 200, 30);
        l4.setBounds(30, 250, 100, 30);
        t4.setBounds(150, 250, 200, 30);
        b.setBounds(150, 300, 100, 30);
 
        // Adding the components to the frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b);
        add(c1);
        add(c2);
        add(sc);
 
        // Setting the size and making the frame visible
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the application closes when the window is closed
        setVisible(true);
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Swing());  
    }
}