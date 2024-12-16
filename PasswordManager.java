import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.security.SecureRandom;

public class PasswordManager extends JFrame {

    private JTextField passwordField;
    private JTextArea savedPasswordsArea;
    private JButton generateButton, saveButton, loadButton;

    public PasswordManager() {
        setTitle("Password Manager");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        passwordField = new JTextField(20);
        savedPasswordsArea = new JTextArea(10, 30);
        savedPasswordsArea.setEditable(false);
        generateButton = new JButton("Generate Password");
        saveButton = new JButton("Save Password");
        loadButton = new JButton("Load Passwords");

        // Add action listeners
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = generatePassword(12);
                passwordField.setText(password);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                savePassword(passwordField.getText());
            }
        });

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPasswords();
            }
        });

        // Layout setup
        JPanel panel = new JPanel();
        panel.add(new JLabel("Generated Password:"));
        panel.add(passwordField);
        panel.add(generateButton);
        panel.add(saveButton);
        panel.add(loadButton);

        JScrollPane scrollPane = new JScrollPane(savedPasswordsArea);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }
        return password.toString();
    }

    private void savePassword(String password) {
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No password to save!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try (FileWriter writer = new FileWriter("passwords.txt", true)) {
            writer.write(password + "\n");
            JOptionPane.showMessageDialog(this, "Password saved!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadPasswords() {
        try (BufferedReader reader = new BufferedReader(new FileReader("passwords.txt"))) {
            savedPasswordsArea.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                savedPasswordsArea.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordManager().setVisible(true);
            }
        });
    }
}