// sometimes it requires javac -encoding UTF-8 PeppaPasswordManager.java for the emojis
//I ran this in VS with java PeppaPasswordManager
//sometimes it requires this cd "C:\Users\kelle\Downloads\Peppapig" too if personal
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.security.SecureRandom;
import javax.sound.sampled.*;
import java.net.URL;

public class PeppaPasswordManager extends JFrame {

    private JTextField snortyPasswordField;
    private JTextArea piggySavedPasswords;
    private JButton oinkGenerateBtn, muddySaveBtn, georgeLoadBtn, clearBtn, clearAllPasswordsBtn;
    private Clip backgroundMusic;

    public PeppaPasswordManager() {
        setTitle("🐷 Peppa Pig Password Manager 🐷");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Peppa colors
        Color peppaPink = new Color(255, 182, 193);
        Color pastelBlue = new Color(173, 216, 230);
        Font peppaFont = new Font("Comic Sans MS", Font.BOLD, 14);

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
        clearBtn = new JButton("Clear Everything! 💧");
        clearAllPasswordsBtn = new JButton("Clear All Passwords 🐷");

        oinkGenerateBtn.setFont(peppaFont);
        muddySaveBtn.setFont(peppaFont);
        georgeLoadBtn.setFont(peppaFont);
        clearBtn.setFont(peppaFont);
        clearAllPasswordsBtn.setFont(peppaFont);

        // Action Listeners
        oinkGenerateBtn.addActionListener(e -> {
            String peppaPassword = generatePeppaPassword(12);
            snortyPasswordField.setText(peppaPassword);
            playSound("oink.wav");
            showRandomPeppaPopup("Generated a snorty password! 🐷");
            showSimpleMessage("Password Generated! 🐽");
        });

        muddySaveBtn.addActionListener(e -> {
            savePeppaPassword(snortyPasswordField.getText());
        });

        georgeLoadBtn.addActionListener(e -> {
            loadGeorgePasswords();
            playSound("boom.wav");
            showRandomPeppaPopup("Loaded all your piggy passwords! 🐖");
            showSimpleMessage("Passwords Loaded! 📖");
        });

        clearBtn.addActionListener(e -> {
            snortyPasswordField.setText("");
            piggySavedPasswords.setText("");
            clearPeppaPasswordsFile();
            playSound("grunt.wav");
            showRandomPeppaPopup("Cleared everything! 💧");
            showSimpleMessage("Everything Cleared! 🧹");
        });

        // New action listener for the "Clear All Passwords" button
        clearAllPasswordsBtn.addActionListener(e -> {
            piggySavedPasswords.setText("");
            clearPeppaPasswordsFile();
            playSound("clear.wav");
            showRandomPeppaPopup("Cleared all piggy passwords! 🐷");
            showSimpleMessage("All Passwords Cleared! 🧹");
        });

        // Layout
        JPanel topPanel = new JPanel();
        topPanel.setBackground(peppaPink);
        topPanel.add(new JLabel("🍼 Your Snorty Password:"));
        topPanel.add(snortyPasswordField);
        topPanel.add(oinkGenerateBtn);
        topPanel.add(muddySaveBtn);
        topPanel.add(georgeLoadBtn);
        topPanel.add(clearBtn);
        topPanel.add(clearAllPasswordsBtn);

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
            JOptionPane.showMessageDialog(this, "Oopsie! Nothing to save! 🐷", "Uh-oh! 🐷", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isPasswordDuplicate(password)) {
            JOptionPane.showMessageDialog(this, "You already saved this one! 🐖 Try a new oink!", "Duplicate Oink 🐖", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (FileWriter writer = new FileWriter("peppa_passwords.txt", true)) {
            writer.write(password + "\n");
            playSound("save.wav");
            showRandomPeppaPopup("Saved in Peppa’s vault! 🎀🐷");
            showSimpleMessage("Password Saved! 🎀");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isPasswordDuplicate(String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("peppa_passwords.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(password.trim())) {
                    return true;
                }
            }
        } catch (IOException e) {
            // Ignore if file does not exist yet
        }
        return false;
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

    private void playSound(String soundName) {
        try {
            URL url = getClass().getResource(soundName);
            if (url != null) {
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            }
        } catch (Exception e) {
            System.out.println("Sound not found: " + soundName);
        }
    }

    private void startBackgroundMusic(String musicFile) {
        try {
            URL url = getClass().getResource(musicFile);
            if (url != null) {
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                backgroundMusic = AudioSystem.getClip();
                backgroundMusic.open(audioIn);
                backgroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
            }
        } catch (Exception e) {
            System.out.println("Background music not found: " + musicFile);
        }
    }

    private void showRandomPeppaPopup(String message) {
        String[] peppaImages = {"peppa1.png", "peppa2.png", "peppa3.png"};
        SecureRandom random = new SecureRandom();
        String randomImage = peppaImages[random.nextInt(peppaImages.length)];
        ImageIcon peppaIcon = new ImageIcon(getClass().getResource(randomImage));
        JOptionPane.showMessageDialog(this, message, "Peppa Says... 🐷", JOptionPane.INFORMATION_MESSAGE, peppaIcon);
    }

    private void showSimpleMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Notification 🐷", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clearPeppaPasswordsFile() {
        try (FileWriter writer = new FileWriter("peppa_passwords.txt", false)) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PeppaPasswordManager manager = new PeppaPasswordManager();
            manager.setVisible(true);
            manager.startBackgroundMusic("peppa.wav");
        });
    }
}
