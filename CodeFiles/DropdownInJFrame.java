import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownInJFrame {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JFrame with JComboBox");

        // Set the layout manager for the frame
        frame.setLayout(new FlowLayout());

        // Create an array of strings to be displayed in the dropdown
        String[] items = {"Option 1", "Option 2", "Option 3", "Option 4"};

        // Create a JComboBox with the array of strings
        JComboBox<String> dropdown = new JComboBox<>(items);

        // Create a label to display the selected item
        JLabel selectedItemLabel = new JLabel("Selected item will appear here.");

        // Add an ActionListener to the JComboBox
        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected item from the JComboBox
                String selectedItem = (String) dropdown.getSelectedItem();

                // Display the selected item in the label
                selectedItemLabel.setText("Selected: " + selectedItem);
            }
        });

        // Add components to the frame
        frame.add(dropdown);
        frame.add(selectedItemLabel);

        // Set the size of the frame
        frame.setSize(300, 150);

        // Make the frame visible
        frame.setVisible(true);

        // Add a window listener for the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
