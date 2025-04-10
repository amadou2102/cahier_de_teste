package gui;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JComboBox<String> roleCombo;
    private JLabel statusLabel;


    public LoginFrame() {
        setTitle("Connexion au Cahier de Texte");
        setSize(400, 600); //la taille de l interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 🔹 Logo
        JLabel logoLabel = new JLabel();
        logoLabel.setHorizontalAlignment(JLabel.CENTER);
        ImageIcon logoIcon = new ImageIcon("image/Logo.jpg"); // ← chemin vers ton logo
        Image img = logoIcon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        logoLabel.setIcon(new ImageIcon(img));
        add(logoLabel, BorderLayout.NORTH);




        // Panel principal
        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(100, 15, 300, 40));

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Mot de passe:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        // Rôle
        panel.add(new JLabel("Rôle:"));
        roleCombo = new JComboBox<>(new String[] {
                "Responsable",
                "Professeur",
                "Chef de département"
        });
        panel.add(roleCombo);


        JButton loginButton = new JButton("Se connecter");


        panel.add(loginButton);

        statusLabel = new JLabel("");
        panel.add(statusLabel);

        add(panel, BorderLayout.CENTER);
    }



}

