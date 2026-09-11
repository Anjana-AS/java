package anjana;



import java.awt.*;
import java.awt.event.*;

public class gui extends Frame implements ActionListener {

    List list;
    TextField textBox;
    Button button;

    // Constructor
    gui() {
        // Create components
        list = new List();
        textBox = new TextField(20);
        button = new Button("Add");

        // Add items to the list
        list.add("Java"); 
        list.add("Python");
        list.add("C++");

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(list);
        add(textBox);
        add(button);

        // Register button event
        button.addActionListener(this);

        // Frame properties
        setTitle("Simple GUI");
        setSize(400, 300);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // Button action
    public void actionPerformed(ActionEvent e) {
        String text = textBox.getText();

        if (!text.isEmpty()) {
            list.add(text);
            textBox.setText("");
        }
    }

    public static void main(String[] args) {
        new gui();
    }
}
