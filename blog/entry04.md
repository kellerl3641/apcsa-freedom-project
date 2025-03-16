# Entry 4

##### 03/16/25

### Content:

During the past weeks, I have made excellent progress on my Java swing password and generator program. I mainly focused on 2 parts: **implementing password generation** and **validating user inputs** before actually generating the password just so the program would be more efficient.

I created a working password generator using the **generatePassword()** method that creates a random password using uppercase letters, lowercase letters, numbers, and special characters. I also added an input validation step to make sure the user enters a number between **4 and 50** before generating a password.

Here’s the final version of my password generator method:

```java
public static String generatePassword(int length) {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    Random random = new Random();
    StringBuilder password = new StringBuilder();

    for (int i = 0; i < length; i++) {
        int index = random.nextInt(chars.length());
        password.append(chars.charAt(index));
    }

    return password.toString();
}
```
This code builds on from the past code examples where there has already been a random String object that stores all the characters in the alphabet from letter A to Z and numbers from 0 to 9 that has some special characters (for the computer to later generate)
This method takes the **length** input from the user, picks random characters from the `chars` string, and builds a password of the desired length using `StringBuilder`.

The second thing I worked on was **validating user input before generating a password**. I wanted to prevent users from entering non-numeric values or an invalid password length. Here’s how I handled it in my GUI:

```java
JTextField lengthField = new JTextField(5);
JButton generateButton = new JButton("Generate Password");

generateButton.addActionListener(e -> {
    String input = lengthField.getText();

    try {
        int length = Integer.parseInt(input);
        if (length < 4 || length > 50) throw new IllegalArgumentException();

        JOptionPane.showMessageDialog(null, "Generated Password: " + generatePassword(length));
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Enter a number between 4 and 50.");
    }
});

```


### Engineering Design Process:

I am now moving from **Step 4(Plan the most promising solution)** to **Step 5 (Create a Prototype)**. The password generation and validation parts are mostly done, so my next step is to **create buttons, frames, and UI components** to make my application user-friendly.

### Skills:
One major skill I developed was **debugging and breaking down code into steps**. Writing out my logic in **plain English first** before coding really helped me understand the process better especially when it came to creating the part where I had to check my user's input.

For **Entry 5**, I plan to work on creating a **basic UI layout** for the user to better visualize their passwords and feel better when they're looking at my UI layouts.
[Next](entry05.md)

[Home](../README.md)
