package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    private String name;
    private String[][] questions;
    private String[][] useranswers;
    private String[][] answers;
    private int score;

    Score(String name, int score, String[][] questions, String[][] useranswers, String[][] answers) {
        this.name = name;
        this.questions = questions;
        this.useranswers = useranswers;
        this.answers = answers;
        this.score = score;
        
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(600, 20, 200, 200);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing Quiz Me");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        int y = 250;
        for (int i = 0; i < questions.length; i++) {
            JLabel question = new JLabel((i+1) + ". " + questions[i][0]);
            question.setBounds(45, y, 700, 30);
            question.setFont(new Font("Tahoma", Font.PLAIN, 12));
            add(question);

            JLabel userAnswerLabel = new JLabel("Your answer: " + useranswers[i][0]);
            userAnswerLabel.setBounds(45, y + 15, 700, 30);
            userAnswerLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
            add(userAnswerLabel);

            JLabel correctAnswerLabel = new JLabel("Correct answer: " + answers[i][1]);
            correctAnswerLabel.setBounds(45, y + 30, 700, 30);
            correctAnswerLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
            add(correctAnswerLabel);

            y += 60;
        }

        JButton submit = new JButton("Exit");
        submit.setBounds(380, y, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
        
        
        
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Exit")) {
            // Close the current window
            System.exit(0);// Create a new Quiz window
        }
    }

    public static void main(String[] args) {
        new Score("User", 0, null, null, null);
    }
}
  