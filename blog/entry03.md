# Entry 3
##### 02/08/25

### Content:
Over the winter break, I have finished planning my to-do list for my project of creating a password saver and generator using Java Swing. Here are the steps that involves my project.

1) Set Up the Project

2) Create a new Java project and a main class (e.g., PasswordManager).
3) Design the UI and what would be the look and feel for the user.

4) Use JFrame for the main window.
5) Add some buttons:
- `TextInsert` to input password length.
- `GenButton` to generate passwords.
- `displayBut` to display passwords and saved ones.
6) Password Generation Logic
7) Include checking errors and length (more of that later)

This is just the basic set up of my project that runs through everything that it should be able to do. I was brainstorming more on step 6 because I needed to understand how I would check lengths, what are some valid inputs as passwords and how to save the user passwords into another file to show later.

I did come up with a testing code of generating passwords. Check out my code sample below:

```java
public static String generatePassword(int length) {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    Random random = new Random();
    //something goes here
    //create a string variable named password to store the value at the index chars.
    //next loop through my string of characters in char
    //then place the value at that index into the string variable
    //continue until length is reached
    return password.toString();
}
```

That's what I came up with for generating my password but I don't exactly know how I would do that with code yet so.... I'll figure that out soon.

The second thing that I tried around with was how to effectively check the user's input length BEFORE they click submit to their password. Some passwords are just too unsafe and short to be used in their daily lives...

```java
    // Define min and max password length
    int MIN_LENGTH = 4;
    int MAX_LENGTH = 50;

    // Check if the length is within a valid range
    if (length < MIN_LENGTH || length > MAX_LENGTH) {
        return "Error: Password length must be between " + MIN_LENGTH + " and " + MAX_LENGTH + " characters.";
    }
```
These lines of code can be placed right above the code that generates password for the user because everytime it runs, it would check the length of their input first.

### Sources:
One of the main resource that I have been using is this book called "Head First Java" by Kathy Sierra etc etc... The book goes through the fundamentals of Swing and how to apply it in my code. I have learned about GUI(s) and HOW to use JFrame to create different kinds of layouts but I'm still confused on the shortcuts that they can use like

```java
frame.add(lengthField);
frame.add(generateButton);
frame.add(new JScrollPane(passwordArea));
frame.add(saveButton);

saveButton.addActionListener(e -> savePassword(passwordArea.getText()));

frame.setLayout(new FlowLayout());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
```
When I tell you that I'm confused by the line of code above, I am not joking because what the heck does that mean in english???! What does e--> thing do???? What is FlowLayout?? This just shows how much more I need to read....
### Engineering Design Process:
I'm currently somewhere between step 4 and 5 of my EDP, I'm trying to gather and plan while creating my plans. I want to finish my code with generating passwords and then I'll slowly crawl into creating my actuals buttons, Frames and then lastly, I'll work on errors and checking for the validity of user inputs.

### Skills
Some skills that I were bestowed upon me was mainly Logical Reasoning because I had to place my codes into english first and try to break down each sentence with code. For example, I first had to write "create a variable string that includes the alphabet" and my line of code would be `String alphabets = blah blah blah` and then so on. My plan would definitely be trying to get a section of my project code going and being able to test out inputs and outputs.

[Next](entry04.md)

[Home](../README.md)
