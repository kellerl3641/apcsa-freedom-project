# Entry # 5
##### 04/25/25
### Content:

This whole week I was finishing up the final touches of my project where I make sure there are buttons for each feature and even though I finished the main functions of my buttons, I thought about creating more buttons that can help clear my code, make the colors stand out more.
I already had the password logic and input validation from before (see Entry 4), so now I focused on building a cute little UI using Java Swing that has peppa pig PICTURES!!! and a clearing button.

Here’s a quick sneak peek at how I set things up:

```java
public class PeppaPasswordManager extends JFrame {

    private JTextField snortyPasswordField;
    private JTextArea piggySavedPasswords;
    private JButton oinkGenerateBtn, muddySaveBtn, georgeLoadBtn;

    public PeppaPasswordManager() {
        setTitle("🐷 Peppa Pig Password Manager 🐽");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Peppa colors
        Color peppaPink = new Color(255, 182, 193);
        Color pastelBlue = new Color(173, 216, 230);
        Font peppaFont = new Font("Comic Sans MS", Font.BOLD, 14); // close to Peppa style

        // Initialize components
        snortyPasswordField = new JTextField(20);
        snortyPasswordField.setFont(peppaFont);

        piggySavedPasswords = new JTextArea(10, 30);
        piggySavedPasswords.setFont(peppaFont);
        piggySavedPasswords.setEditable(false);
        piggySavedPasswords.setBackground(pastelBlue);

        oinkGenerateBtn = new JButton("Generate Piggy Passwords!! 🐽");
        muddySaveBtn = new JButton("SAY 'Oink' to Save 🐷");
        georgeLoadBtn = new JButton("See ALL THEM Saved Ones 🐖");

        oinkGenerateBtn.setFont(peppaFont);
        muddySaveBtn.setFont(peppaFont);
        georgeLoadBtn.setFont(peppaFont);

        // Action Listeners
        oinkGenerateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String peppaPassword = generatePeppaPassword(12);
                snortyPasswordField.setText(peppaPassword);
            }
        });

        muddySaveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savePeppaPassword(snortyPasswordField.getText());
            }
        });

        georgeLoadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadGeorgePasswords();
            }
        });

        // Layout
        JPanel topPanel = new JPanel();
        topPanel.setBackground(peppaPink);
        topPanel.add(new JLabel("🍼 Your Snorty Password:"));
        topPanel.add(snortyPasswordField);
        topPanel.add(oinkGenerateBtn);
        topPanel.add(muddySaveBtn);
        topPanel.add(georgeLoadBtn);

        JScrollPane scrollPane = new JScrollPane(piggySavedPasswords);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        getContentPane().setBackground(peppaPink);
    }
}
```
I've also changed the password display to be on the page instead of a pop out because it really allows the reader to know what they're saving instead of having to be stuck guessing the passwords.

Some key things that I did: <br>

I've set up my main frame which is the button, layouts, having pop out windows for the user to type their passwords in.

Added labels and fields: One of the label is to create password/ generate it while the others are just fpr

Organized components with the help of JFrame: It quickly creates everything in a clean layout instead of having to manually select and duplicate buttons one by one.

Made it interactive: The generate button is connected to the password generation method from before.

To make the result look nicer, I created the generate button so the password shows up inside the page instead of a pop-up box:

```java
 private String generatePeppaPassword(int length) {
        String chars = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz0123456789!@#$%&";
        SecureRandom random = new SecureRandom();
        StringBuilder snort = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            snort.append(chars.charAt(random.nextInt(chars.length())));
        }
        return snort.toString();
    }
```
Now users can:
 Click to "Generate Password"

### Sources:
Some sources that I used:
- I used three main sources from the official [Oracle Java](https://www.oracle.com/java/) documentation to help guide my design and coding choices:

- I used How to Use [FlowLayout](https://www.flowout.com/) to understand how to position components horizontally and center them in a neat row inside my panel.

- I used a lot of youtube to learn how to make frames and learn how to set up a JFrame, adjust its size, and control how the window behaves when the user closes it.

### Engineering Design Process:
I’m fully deep into Step 5: Create a Prototype now. The main features are built, and the layout gives users real-time feedback. My next step is Step 6 which is "Test and Evaluate the Prototype", where I’ll be asking classmates or friends to try the app and give me feedback (mostly my parents).


### Skills
Some skills that I got this week using coding is how to properly produce results with Java Swing without having to just do copy and paste.

I want to concentrate on testing and styling the program for Entry 6. I want to update the UI to look more cutesy and interesting by changing the fonts, colors, and perhaps even the icons.

[Next](entry06.md)

[Home](../README.md)