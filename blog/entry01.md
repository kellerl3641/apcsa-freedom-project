# Entry 1
##### 11/03/24

### Content:
My tool for this Freedom Project this year is SWING and I want to make a password saver/generator that can help save time for users when they have to go different websites and enter their information. I first went to [Geeks for Geeks](https://www.geeksforgeeks.org/introduction-to-java-swing/) to learn more about what exactly makes up Swing and what's the usage for Swing. Here's what I summed up:
<br>
- **Pluggable Look and Feel**: Switch look and feel of components without restarting.
- **MVC Architecture**: Uses Model-View-Controller design.
- **Lightweight Components**: Do not rely on non-Java system classes.
- **Platform Independent**: Java GUI is unaffected by platform-specific O/S look and feel.
- **Advanced Features**: Includes JTable, JTabbedPane, JScrollPane, and more.
- **Highly Customizable**: Easy customization as visual appearance is separate from internal representation.
- **Rich Controls**: Provides advanced controls like Tree, TabbedPane, slider, color picker, and table.
<hr>

### Sources:
Some sources that I also investigated was [JApplet](https://docs.oracle.com/javase/7/docs/api/javax/swing/JApplet.html). I kept seeing this in the documentation for Swing and wondered what it does and to be fair, I didn't quite get far with that because I was trying to analyze codes that looked like this

```java
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InteractiveApplet extends JApplet {
    private JLabel label;
    private JButton button;

    // This method is called when the applet is loaded into the browser.
    public void init() {
        // Initialize the applet
        label = new JLabel("Hello, World!", JLabel.CENTER);
        button = new JButton("Click Me!");

        // Set layout and add components
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });
    }

    // This method is called when the applet is started.
    public void start() {
        // Code to start the applet (if needed)
    }

    // This method is called when the applet is stopped.
    public void stop() {
        // Code to stop the applet (if needed)
    }

    // This method is called when the applet is destroyed.
    public void destroy() {
        // Cleanup code (if needed)
    }

    // This method is used to paint the applet.
    public void paint(Graphics g) {
        super.paint(g);
        // Custom painting code (if needed)
    }
}
```
Like Hello...? but I think in short it's a library that Java can call when they need an easier way of hadling actionListeners or how Javascript will call that as "EventListeners". You can see how at the top of the code, it begins with `import javax.swing.JApplet;` to call the library that is inside Swing... so basically JApplet is a library that is inside SWING. (●'◡'●)

### Engineering Design Process:
I'm currently on step 2 of my EDP, I figured out what topic I will do and what I would make with my topic so now I'm just analyzing HOW I would make it. (Dear Lord.... I can barely even read the documentation without saying HUH). I plan on first making a to-do list of what I need to complete and what should be completed and then figuring out how I would do step one, step two, and etc.

### Skills
The major skill that I learned to use was effectively using online resources to understand topics and staying curious about everything that comes my way because that's the how learning works. If you don't WANT to learn something, you'll never fully grasp the concept of it.

[Next](entry02.md)

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
