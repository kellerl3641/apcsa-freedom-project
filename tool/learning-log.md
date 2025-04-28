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


### 10/21/24:

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

The code above is a short button that displays "Click me" and then add frames after the user interacts with it. <br>
In short, the Swing application can be made into anything interactive.


11/4/24

11/18

I was planning out my tool and started on the basic set up of SWING library importment and all of them require
```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
```
import javax.swing.; imports all the classes from the javax.swing package, which are used for creating the graphical user interface components like JFrame, JLabel, JTextField, and JButton.<br>
import java.awt.; imports all the classes from the java.awt package, which are used for layout management and creating the graphical user interface. <br>
import java.awt.event.ActionEvent; imports the ActionEvent class, which represents an action event.<br>
import java.awt.event.ActionListener; imports the ActionListener interface, which is used for receiving action events. <br>
import java.security.SecureRandom; imports the SecureRandom class, which provides a cryptographically strong random number generator.

I will begin creating classes next class and learning how to set class.


1/6/2024

#### **Phase 1: Project Setup**
- [ ] Create a new Java project in your IDE.
- [ ] Import the required packages: `javax.swing`, `java.awt`, `java.util`.

#### **Phase 2: Design the User Interface**
- [ ] Create a `JFrame` window.
- [ ] Add these components:
   - `JLabel` for instructions.
   - `JTextField` for entering website and username.
   - `JPasswordField` for entering or displaying the password.
   - `JButton` for **Save**, **Generate Password**, and **Copy to Clipboard**.
   - `JTable` to display saved passwords.
- [ ] Arrange the layout using `JPanel` and `GridLayout`.

#### **Phase 3: Password Generation**
- [ ] Write a method to generate random passwords using:
   - A combination of letters, numbers, and symbols.
   - Example: `"ABCabc123!@#"`
- [ ] Let the password appear in the password field when the **Generate Password** button is clicked.

#### **Phase 4: Save and Display Passwords**
- [ ] Store credentials using an `ArrayList` or `HashMap`.
- [ ] Display saved passwords in the `JTable`.
- [ ] Make sure each entry includes:
   - Website name
   - Username
   - Password

#### **Phase 5: Event Handling (Button Clicks)**
- [ ] **Save Button:** Save the entered details to the list and update the table.
- [ ] **Generate Button:** Call the password generation method.
- [ ] **Copy to Clipboard Button:** Copy the generated password to the clipboard using `Toolkit`.

#### **Phase 6: File Saving (Optional)**
- [ ] Save passwords to a text file (`.txt`) using `FileWriter`.
- [ ] Load data from the file when the app starts.

The next step would be to start on part one

Yau moot yau si boon miu seung bei
Yiu si ngoh gam maan yi dei duen hei
MAn nei hoh hang jik ye gon daap tung siu haak gei

Yau moot yu yat si boon miu foon hei
Joi mo yan yi hau loi faan jue nei
Yuen gok dak jeung je jaak yam ga jue han lei kei
Si ngoh ji si gam sai jui hau so yiu dik yan yi
Ji seung si nei
__________________________________________________________________________________________________________________________________________
04/27/25
I have officially finished my MVP and am ready to move along to my beyond MVP.... Here are some things that I planned to change that could make my app way more flexible and silly.
✅ = Accomplished
❎ = Have not yet accomplished

List of extra features that will be added:
- [❎] Prevents any signs of duplicate passwords (To match the authenticity of an actual password saver)
- [❎] Clear saved passwords: Deletes all passwords from the screen and file when you press the Clear Button.
- [❎] Cute sound effects: Plays oink.wav, save.wav, load.wav, clear.wav when the user interacts with the buttons.
- [❎] Background music: Plays peppa_theme.wav on a loop when the window pops out!
- [❎] Peppa Pig popups: Cute Peppa images pop up when you click buttons (After saving)
- [❎] Simple confirmation popups: Always show popups like "Saved! 🎀", "Cleared! 🧹" after each action


Important files that I keep in mind for later:
- Images files that pop up when the user clicks the different buttons: peppa1.png, peppa2.png, peppa3.png
- - Background Sounds file: peppa_theme.wav
- Sound Effect Files: oink.wav, save.wav, load.wav, clear.wav
