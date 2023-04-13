package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
 
    JButton rulesButton, backButton;
    JTextField nameTextField;
    
    Login() {
        // Set background color and layout manager
        getContentPane().setBackground(new Color(0xC8C9C7));
        setLayout(null);
        
        // Set up logo image
        ImageIcon logoIcon = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(0, 0, 600, 475);
        add(logoLabel);
        
        // Set up title label
        JLabel titleLabel = new JLabel("Quiz Me");
        titleLabel.setBounds(750, 50, 300, 70);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 60));
        titleLabel.setForeground(new Color(0x010101));
        add(titleLabel);
        
        // Set up name label
        JLabel nameLabel = new JLabel("Enter your name:");
        nameLabel.setBounds(750, 160, 300, 30);
        nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
        nameLabel.setForeground(new Color(0x010101));
        add(nameLabel);
        
        // Set up name text field
        nameTextField = new JTextField();
        nameTextField.setBounds(750, 200, 300, 40);
        nameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        nameTextField.setBackground(new Color(0xE5E5E5));
        nameTextField.setForeground(new Color(0x1D3557));
        nameTextField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        add(nameTextField);
        
        // Set up rules button
        rulesButton = new JButton("Rules");
        rulesButton.setBounds(750, 280, 130, 40);
        rulesButton.setBackground(new Color(0x010101));
        rulesButton.setForeground(new Color(0xF8F8F2));
        rulesButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
        rulesButton.addActionListener(this);
        add(rulesButton);
        
        // Set up back button
        backButton = new JButton("Back");
        backButton.setBounds(920, 280, 130, 40);
        backButton.setBackground(new Color(0x010101));
        backButton.setForeground(new Color(0xF8F8F2));
        backButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
        backButton.addActionListener(this);
        add(backButton);
        
        // Set up frame properties
        setSize(1100, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rulesButton) {
            String name = nameTextField.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == backButton) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}

