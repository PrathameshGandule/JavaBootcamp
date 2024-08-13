// import java.awt.*;
// class AWTExample extends Frame{
//     AWTExample(){
//         Button b = new Button("Click Me");
//         b.setBounds(100, 100, 100, 40);
//         add(b);
//         setSize(800, 500);
//         setLayout(null);
//         setVisible(true);
//     }
// }
// class AWTMain{
//     public static void main(String[] args) {
//         AWTExample a = new AWTExample();
//     }
// }
// import java.awt.*;
// import java.awt.event.*;

// public class SimpleAWTApp {

//     public static void main(String[] args) {
//         // Create a frame
//         Frame frame = new Frame("Simple AWT Application");

//         // Set the layout manager for the frame
//         frame.setLayout(new FlowLayout());

//         // Create a label
//         Label label = new Label("Enter your name:");

//         // Create a text field
//         TextField textField = new TextField(20);

//         // Create a button
//         Button button = new Button("Greet");

//         // Create another label to display the greeting
//         Label greetingLabel = new Label();

//         // Add an action listener to the button
//         button.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 String name = textField.getText();
//                 greetingLabel.setText("Hello, " + name + "!");
//             }
//         });

//         // Add components to the frame
//         frame.add(label);
//         frame.add(textField);
//         frame.add(button);
//         frame.add(greetingLabel);

//         // Set the size of the frame
//         frame.setSize(300, 200);

//         // Make the frame visible
//         frame.setVisible(true);

//         // Add a window listener for the close button
//         frame.addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent we) {
//                 System.exit(0);
//             }
//         });
//     }
// }


import java.awt.*;
import java.awt.event.*;

public class LoginFormAWT {

    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Login Form");

        // Set the layout manager for the frame
        frame.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns, 10px gap

        // Create labels
        Label firstNameLabel = new Label("First Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label messageLabel = new Label(); // This label will display messages

        // Create text fields
        TextField firstNameField = new TextField(20);
        TextField lastNameField = new TextField(20);

        // Create a button
        Button submitButton = new Button("Submit");

        // Add an action listener to the button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText().trim();
                String lastName = lastNameField.getText().trim();

                if (firstName.isEmpty() || lastName.isEmpty()) {
                    messageLabel.setText("Please enter both first and last names.");
                    messageLabel.setForeground(Color.RED);
                } else {
                    messageLabel.setText("Welcome, " + firstName + " " + lastName + "!");
                    messageLabel.setForeground(Color.GREEN);
                }
            }
        });

        // Add components to the frame
        frame.add(firstNameLabel);
        frame.add(firstNameField);
        frame.add(lastNameLabel);
        frame.add(lastNameField);
        frame.add(new Label()); // Empty label for spacing
        frame.add(submitButton);
        frame.add(new Label()); // Empty label for spacing
        frame.add(messageLabel);

        // Set the size of the frame
        frame.setSize(350, 200);

        // Make the frame visible
        frame.setVisible(true);

        // Add a window listener for the close button
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

