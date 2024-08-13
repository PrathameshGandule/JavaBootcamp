import java.awt.*;

class AWT2 extends Frame{
    public static void main(String[] args) {
        Frame f = new Frame("Login Form");
        Label firstnameLabel = new Label("Enter your first name : ");
        TextField firstname = new TextField(20);
        Label lastnameLabel = new Label("Enter your last name : ");
        TextField lastname = new TextField(20);
        Button b = new Button("Submit");

        f.add(firstnameLabel);
        f.add(firstname);
        f.add(lastnameLabel);
        f.add(lastname);
        f.add(b);

        // b.setBounds(30, 100, 50, 50);

        f.setSize(500, 200);
        f.setVisible(true);
    }
}

// class AWTMain{
//     public static void main(String[] args) {
//         AWT2 a = new AWT2();
//     }
// }
