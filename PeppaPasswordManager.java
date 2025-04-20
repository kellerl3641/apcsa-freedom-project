// sometimes it requires javac -encoding UTF-8 PeppaPasswordManager.java for the emojis
//I ran this in VS with java PeppaPasswordManager
//sometimes it requires this cd "C:\Users\kelle\Downloads\Peppapig" too if personal
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.security.SecureRandom;

public class PeppaPasswordManager extends JFrame {

    private JTextField snortyPasswordField;
    private JTextArea piggySavedPasswords;
    private JButton oinkGenerateBtn, muddySaveBtn, georgeLoadBtn;

    public PeppaPasswordManager() {
        setTitle("🐷 Peppa Pig Password Manager 🐽");
        setSize(450, 350);
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

    private String generatePeppaPassword(int length) {
        String chars = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz0123456789!@#$%&";
        SecureRandom random = new SecureRandom();
        StringBuilder snort = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            snort.append(chars.charAt(random.nextInt(chars.length())));
        }
        return snort.toString();
    }

    private void savePeppaPassword(String password) {
        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Oopsie! Nothing to save! 🐷", "Uh-oh!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try (FileWriter writer = new FileWriter("peppa_passwords.txt", true)) {
            writer.write(password + "\n");
            JOptionPane.showMessageDialog(this, "Saved in Peppa’s vault! 🎀");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadGeorgePasswords() {
        try (BufferedReader reader = new BufferedReader(new FileReader("peppa_passwords.txt"))) {
            piggySavedPasswords.setText("");
            String line;
            while ((line = reader.readLine()) != null) {
                piggySavedPasswords.append(line + "\n");
            }
        } catch (IOException e) {
            piggySavedPasswords.setText("No piggy passwords found yet! 🐖");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PeppaPasswordManager().setVisible(true));
    }
}
