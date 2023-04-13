package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(0xC8C9C7));
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quiz Me");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setForeground(new Color(0, 0, 0));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(30, 60, 700, 350);
        rules.setFont(new Font("Tahoma", Font.BOLD, 20));
        rules.setText(
            "<html>"+ 
                "1. Please provide clear and concise answers." + "<br><br>" +
                "2. You are encouraged to work independently, but feel free to ask for help if needed." + "<br><br>" +
                "3. All questions are mandatory." + "<br><br>" +
                "4. Remember to stay focused and try your best." + "<br><br>" +
                "5. Worry about the time, but also focus on answering the questions correctly." + "<br><br>" +
                "6. Stay relaxed and have fun!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
