# Plan

## Tool: Java Swing
## Product: A password generator and saver

## Timeline

### **MVP (Most Viable Product)**

#### **Step 1: Set Up Java Swing UI** ( [ ] Due by 2/21 )
- [ ] Create a basic app window (using `JFrame`) (deadline: 2/21)
- [ ] Add a password display box (Just so users can see what they placed as passwords) (deadline: 2/21)
- [ ] Add a button to generate a new password (deadline: 2/21)

#### **Step 2: Generate Random Passwords** ( [ ] Due by 3/3)

- [ ] using the `SecureRandom` class to safety generate different passwords of any length (unpredictable)
- [ ] Create a mix of uppercase, lowercase, numbers, and symbols
- [ ] stores all the alphabets, numbers, and symbols into a variable.
- [ ] allows the usage of values in different indexes
- [ ] correctly generates passwords (not sure if there could be repeats or not)

#### **Step 3: Display Generated Password** ([ ] Due by 3/5)
- [ ] Show the password inside the text box
- [ ] Make sure the generated passwords are showing and being shown.

#### **Step 4: Add Error Handling & Alerts** ([ ] Due by 3/10)
- **Prevent crashes** if something goes wrong.
- [ ] Shows an error message if the password generator doesn't work
- [ ] Alerts the user if generating the passwords doesn't work as intended
- [ ] Alerts for any systematic errors

### Beyond MVP (Extra Features for Later)

- **Password Management:** (Due by 3/15)
  - [ ] Save and encrypt passwords securely.
  - [ ] Being able to save the passwords to a file that includes all previous passwords
  - [ ] Add a "Delete" button to remove stored passwords.


- **User Experience & Customization:** (Due by 3/18)
  - [ ] Add settings for **password length & complexity**.
  - [ ] Implement **dark mode & UI improvements**.

- **Advanced Features:** (Due by 4/1)
  - [ ] Allow **copying passwords** with a button.
  - [ ] Allow copied passwords to be seen with an icon

<!-- EXAMPLE

## Tool: APIs
## Product: Green Glass Door riddle app

## Timeline

### MVP

- [ ] Front-end
  - [x] Webpage to collect input from user (deadline: 4/15)
  - [ ] Webpage to display "yes, but a ___ can't" or "no, but a ___ can" (deadline: 5/1)
- [x] Back-end
  - [x] Use regex to test whether or not the word can go through the GGD (deadline: 3/1)
  - [x] Use the Twinword API to find related words (deadline: 3/15)
    - [ ] Iterate through the words until an opposite example can be found (deadline: 4/1)

#### Beyond MVP

- [ ] Use another API to make sure the opposite example is a noun
- [ ] Automate notification of API limit to make sure I don’t exceed free quota
- [ ] A multiple choice quizzer that will test the user’s knowledge of the solution

-->





<!-- DO NOT USE THIS YET

| Name | Glows | Grows |
| -------- | ------- | ------- |
|   |   |
|   |   |
|   |   |
|   |   |
|   |   |
|   |   |

-->
