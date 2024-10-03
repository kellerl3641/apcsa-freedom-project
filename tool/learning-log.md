# Tool Learning Log

## Tool: **SWING**

## Project: **Creating a password generator and saver**

---

### 10/03/24:
I decided that I wanted to create a password generator and saver because I tend to forget my passwords. I also chose to learn Swing because it seems very straightforward and fun. I did some basic research on Swing and the "key points" of Swing.

**Swing**
- Java's standard library
- Uses components inside `javax.swing` package
- provides components needed for building graphical user interfaces (GUIs).
- Built on top of AWT (Abstract Window Toolkit)
- Offers a wider variety of components
**Notes to know**
- Swing is not dependent on the native platform's GUI componenets. (Allows for flexibility)
- Allows developers to customize the looks of GUI components.
- Create custom themes.
- Includes buttons, text fields, tables, trees, menus, etc.
- Handles user interfaces such as button clicks, mousemovements, trigger events and other event handling.
**Some other stuff that I haven't figured out are**
- SwingUtilities: I assume this is a class in Swing that provies methods that can help during GUI production? (not sure yet, will dig deeper)
- Support for MVC (Model-View-Controller).
- "Model" is for design patterns and separating the data.
- User interface is the "View".
- Control logic of the application is "Controller"

(Will continue digging)


### X/X/XX:
* Text


<!--
### Example of a Simple Swing Application:
a basic example that creates a simple GUI with a button and a label using Swing:

```java
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Simple Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel
        JPanel panel = new JPanel();

        // Create a label
        JLabel label = new JLabel("Hello, Swing!");

        // Create a button
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> label.setText("Button Clicked!"));

        // Add components to the panel
        panel.add(label);
        panel.add(button);

        // Add panel to the frame
        frame.add(panel);

        // Set the frame visible
        frame.setVisible(true);
    }
}
```
-->
