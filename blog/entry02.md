# Entry 2
##### 12/15/2024

### Content:
My tool is SWING Java and I want to use SWING to make a password saver and generator. I have read some of the basic fundamentals to SWING but I haven't really had any hands on practices so I decided to get myself a book called "Head First Java_ A Brain-Friendly Guide -- Kathy Sierra..." and in chapter 14 and 15 from page 461 - 509 it talks about the basic structures GUI that Java has and how I can incorporate it into my code. GUI means Graphic User Interface where the user can interact with my website or any buttons that I make. SWING is just one part of the GUI. I decided to start testing with the basics like setting up a pop-up window or creating buttons that the user can play around with. Here's the examples below with some explanation: <br>

```java
import javax.swing.*;

public class SimpleWindow {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Simple Swing Window");

        // Set window size and close operation
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    }
}
```
The code above is responsible for making a new window with the name of "Simple Swing Window" and it's main library source is JFrame.<br>
Check out the code below that makes a button that the user can click on and it would display "Button clicked"

```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonLabelExample {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Button and Label Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a label
        JLabel label = new JLabel("Press the button!");
        label.setBounds(100, 30, 200, 30);
        frame.add(label);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(100, 80, 100, 30);
        frame.add(button);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Display the window
        frame.setVisible(true);
    }
}
```
The code above uses 3 different Java classes to activate it, the first one is called JButton (already built in), the second one is called JLabel where you place names and select what you wish to be printed out and lastly, there is the ActionListener (kind of self-explanatory).<hr>
My goal for the winter break is to begin planning out my draft of my project. I want to be able to KNOW what I need to do first in order to even make my password generator. (Like an algorithm to my project).
### Sources:
Some sources that I used is google and amazon because I was spending most of my time reading the book to familiarize myself with Java and how it works in Java. I used to view SWING as a seperate language that I have to learn because it was different from Java but actually it was just one library that you can access inside Java.

### Engineering Design Process:
I'm currently on step 3 of the EDP where I try ways to plan out my project and figure out what's my first step on the to-do list and try my best to analyze my project before I step foot on it.

### Skills
Some skills that I accumulated are "Being nice to google", "Be curious", and most of all "Have fun". I was focusing too much on what SWING can do instead of what I can do with SWING. I was also getting tired really fast because it seems like I was reading blank chunks of code instead of understanding what the code is for. I meant stay curious in a way where you can have fun without feeling annoyed with 0 progress because that's what I focused on....I was trying my best to understand what each line of
```java
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
```
meant instead of focusing on why I need that and it turns out it was just a closing statement that I need in order to close the windows. (Kind of crazy how that took so long to figure out).

[Next](entry03.md)

[Home](../README.md)

<!--
hstatsep.github.io/students/
Content:
Which tool you’ve decided on, why, and how you tinkered with it (code)
Use your learning log to help you!
What you're going to make with it
Sources: link to tools you’ve considered (and their resources)
You can/should also link to the files in your tool folder where you tinkered → → →
EDP: self-explanatory
Skills: self-explanatory
Professionalism: self-explanatory -->
