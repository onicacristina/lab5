package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static JButton startButton;
    private static JButton nextBotton1;
    private static JButton nextBotton2;
    private static JButton nextBotton3;
    private static JButton nextBotton4;
    private static JButton nextBotton5;
    private static Font font1;
    private static Font font2;
    private static Integer numberOfCorrectAnswers=0;
    private static Integer numberOfWrongAnswers;
    private static final Integer NUMBER_OF_QUESTIONS = Quiz.values().length;

    public static void main(String[] args) {

        JPanel jPanel = buildPanel();
        addActionToButton(jPanel);
    }

    private static JPanel buildPanel(){
        JFrame frame = new JFrame("Color Theory Quiz");
        frame.setSize(800,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        placeComponents(panel);
        frame.setVisible(true);

        return panel;
    }

    private static void placeComponents(JPanel panel)
    {
        panel.setLayout(null);
        Font font1 = new Font("SansSerif", Font.BOLD, 28);
        JLabel quizlabel = new JLabel("WELCOME TO THE COLOR THEORY QUIZ!");
        quizlabel.setBounds(80,20,800,200);
        quizlabel.setFont(font1);
        panel.add(quizlabel);

        startButton = new JButton("START QUIZ");
        startButton.setBounds(310,200,150,25);
        startButton.setBackground(Color.ORANGE);
        panel.add(startButton);

    }

    private static void addActionToButton(JPanel panel){
        startButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents1(panel);
                        panel.updateUI();
                        addActionToButton1(panel);
                    }
                }
        );
    }

    private static void addActionToButton1(JPanel panel){
        nextBotton1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents2(panel);
                        panel.updateUI();
                        addActionToButton2(panel);
                    }
                }
        );
    }

    private static void addActionToButton2(JPanel panel){
        nextBotton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents3(panel);
                        panel.updateUI();
                        addActionToButton3(panel);
                    }
                }
        );
    }

    private static void addActionToButton3(JPanel panel){
        nextBotton3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents4(panel);
                        panel.updateUI();
                        addActionToButton4(panel);
                    }
                }
        );
    }

    private static void addActionToButton4(JPanel panel){
        nextBotton4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents5(panel);
                        panel.updateUI();
                        addActionToButton5(panel);
                    }
                }
        );
    }

    private static void addActionToButton5(JPanel panel){
        nextBotton5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        placeComponents6(panel);
                        panel.updateUI();

                    }
                }
        );
    }

    private static void placeComponents1(JPanel panel){
        panel.setLayout(null);

        font1 = new Font("SansSerif", Font.BOLD, 30);
        font2 = new Font("TimesRoman",Font.PLAIN,20);

        JLabel numberOfQuestionLabel= new JLabel("Question 1/5");
        numberOfQuestionLabel.setBounds(10,20,500,25);
        numberOfQuestionLabel.setFont(font1);
        panel.add(numberOfQuestionLabel);

        JLabel questionLabel = new JLabel();
        questionLabel.setText(Quiz.QUESTION_1.getQuestion());
        questionLabel.setBounds(10,70,800,25);
        questionLabel.setFont(font2);
        panel.add(questionLabel);

        JCheckBox answerCheckBox1 = new JCheckBox(Quiz.QUESTION_1.getAnswer_1());
        answerCheckBox1.setBounds(30,110,500,25);
        answerCheckBox1.setFont(font2);
        panel.add(answerCheckBox1);

        JCheckBox answerCheckBox2 = new JCheckBox(Quiz.QUESTION_1.getAnswer_2());
        answerCheckBox2.setBounds(30,150,500,25);
        answerCheckBox2.setFont(font2);
        panel.add(answerCheckBox2);

        JCheckBox answerCheckBox3 = new JCheckBox(Quiz.QUESTION_1.getAnswer_3());
        answerCheckBox3.setBounds(30,190,500,25);
        answerCheckBox3.setFont(font2);
        panel.add(answerCheckBox3);

        JCheckBox answerCheckBox4 = new JCheckBox(Quiz.QUESTION_1.getAnswer_4());
        answerCheckBox4.setBounds(30,230,500,25);
        answerCheckBox4.setFont(font2);
        panel.add(answerCheckBox4);

        nextBotton1 = new JButton("Next");
        nextBotton1.setBounds(30,290,100,25);
        nextBotton1.setBackground(Color.ORANGE);
        panel.add(nextBotton1);

        nextBotton1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if(answerCheckBox1.isSelected() == Quiz.QUESTION_1.isCorrectAnswer_1() &&
                           answerCheckBox2.isSelected() == Quiz.QUESTION_1.isCorrectAnswer_2() &&
                           answerCheckBox3.isSelected() == Quiz.QUESTION_1.isCorrectAnswer_3() &&
                           answerCheckBox4.isSelected() == Quiz.QUESTION_1.isCorrectAnswer_4())
                        {
                            numberOfCorrectAnswers++;
                            JOptionPane.showMessageDialog(null,":)\nCorrect. Keep going!");
                        }
                        else
                            JOptionPane.showMessageDialog(null,":(  . . . Incorrect!\nThe correct answer is: \n " + Quiz.QUESTION_1.getAnswer_4());
                    }
                }
        );
    }

    private static void placeComponents2(JPanel panel){
        panel.setLayout(null);

        JLabel numberOfQuestionLabel= new JLabel("Question 2/5");
        numberOfQuestionLabel.setBounds(10,20,500,25);
        numberOfQuestionLabel.setFont(font1);
        panel.add(numberOfQuestionLabel);

        JLabel questionLabel = new JLabel(Quiz.QUESTION_2.getQuestion());
        questionLabel.setBounds(10,70,800,25);
        questionLabel.setFont(font2);
        panel.add(questionLabel);

        JCheckBox answerCheckBox1 = new JCheckBox(Quiz.QUESTION_2.getAnswer_1());
        answerCheckBox1.setBounds(30,110,500,25);
        answerCheckBox1.setFont(font2);
        panel.add(answerCheckBox1);

        JCheckBox answerCheckBox2 = new JCheckBox(Quiz.QUESTION_2.getAnswer_2());
        answerCheckBox2.setBounds(30,150,500,25);
        answerCheckBox2.setFont(font2);
        panel.add(answerCheckBox2);

        JCheckBox answerCheckBox3 = new JCheckBox(Quiz.QUESTION_2.getAnswer_3());
        answerCheckBox3.setBounds(30,190,500,25);
        answerCheckBox3.setFont(font2);
        panel.add(answerCheckBox3);

        JCheckBox answerCheckBox4 = new JCheckBox(Quiz.QUESTION_2.getAnswer_4());
        answerCheckBox4.setBounds(30,230,500,25);
        answerCheckBox4.setFont(font2);
        panel.add(answerCheckBox4);

        nextBotton2 = new JButton("Next");
        nextBotton2.setBounds(30,290,100,25);
        nextBotton2.setBackground(Color.ORANGE);
        panel.add(nextBotton2);

        nextBotton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if(answerCheckBox1.isSelected() == Quiz.QUESTION_2.isCorrectAnswer_1() &&
                           answerCheckBox2.isSelected() == Quiz.QUESTION_2.isCorrectAnswer_2() &&
                           answerCheckBox3.isSelected() == Quiz.QUESTION_2.isCorrectAnswer_3() &&
                           answerCheckBox4.isSelected() == Quiz.QUESTION_2.isCorrectAnswer_4())
                        {
                            numberOfCorrectAnswers++;
                            JOptionPane.showMessageDialog(null,":)\nCorrect. Keep going!");
                        }
                        else
                            JOptionPane.showMessageDialog(null,":(  . . . Incorrect!\nThe correct answer is: \n " + Quiz.QUESTION_2.getAnswer_1()
                                    + "\n " + Quiz.QUESTION_2.getAnswer_2() + "\n " + Quiz.QUESTION_2.getAnswer_3() + "\n " + Quiz.QUESTION_2.getAnswer_4());
                    }
                }
        );
    }

    private static void placeComponents3(JPanel panel){
        panel.setLayout(null);

        JLabel numberOfQuestionLabel= new JLabel("Question 3/5");
        numberOfQuestionLabel.setBounds(10,20,500,25);
        numberOfQuestionLabel.setFont(font1);
        panel.add(numberOfQuestionLabel);

        JLabel questionLabel = new JLabel(Quiz.QUESTION_3.getQuestion());
        questionLabel.setBounds(10,70,800,25);
        questionLabel.setFont(font2);
        panel.add(questionLabel);

        JCheckBox answerCheckBox1 = new JCheckBox(Quiz.QUESTION_3.getAnswer_1());
        answerCheckBox1.setBounds(30,110,500,25);
        answerCheckBox1.setFont(font2);
        panel.add(answerCheckBox1);

        JCheckBox answerCheckBox2 = new JCheckBox(Quiz.QUESTION_3.getAnswer_2());
        answerCheckBox2.setBounds(30,150,500,25);
        answerCheckBox2.setFont(font2);
        panel.add(answerCheckBox2);

        JCheckBox answerCheckBox3 = new JCheckBox(Quiz.QUESTION_3.getAnswer_3());
        answerCheckBox3.setBounds(30,190,500,25);
        answerCheckBox3.setFont(font2);
        panel.add(answerCheckBox3);

        JCheckBox answerCheckBox4 = new JCheckBox(Quiz.QUESTION_3.getAnswer_4());
        answerCheckBox4.setBounds(30,230,500,25);
        answerCheckBox4.setFont(font2);
        panel.add(answerCheckBox4);

        nextBotton3 = new JButton("Next");
        nextBotton3.setBounds(30,290,100,25);
        nextBotton3.setBackground(Color.ORANGE);
        panel.add(nextBotton3);

        nextBotton3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if(answerCheckBox1.isSelected() == Quiz.QUESTION_3.isCorrectAnswer_1() &&
                           answerCheckBox2.isSelected() == Quiz.QUESTION_3.isCorrectAnswer_2() &&
                           answerCheckBox3.isSelected() == Quiz.QUESTION_3.isCorrectAnswer_3() &&
                           answerCheckBox4.isSelected() == Quiz.QUESTION_3.isCorrectAnswer_4())
                        {
                            numberOfCorrectAnswers++;
                            JOptionPane.showMessageDialog(null,":)\nCorrect. Keep going!");
                        }
                        else
                            JOptionPane.showMessageDialog(null,":(  . . . Incorrect!\nThe correct answer is: \n " +
                                    Quiz.QUESTION_3.getAnswer_1() + "\n " + Quiz.QUESTION_3.getAnswer_3() + "\n " + Quiz.QUESTION_3.getAnswer_4());
                    }
                }
        );
    }

    private static void placeComponents4(JPanel panel){
        panel.setLayout(null);

        JLabel numberOfQuestionLabel= new JLabel("Question 4/5");
        numberOfQuestionLabel.setBounds(10,20,500,25);
        numberOfQuestionLabel.setFont(font1);
        panel.add(numberOfQuestionLabel);

        JLabel questionLabel = new JLabel(Quiz.QUESTION_4.getQuestion());
        questionLabel.setBounds(10,70,800,25);
        questionLabel.setFont(font2);
        panel.add(questionLabel);

        JCheckBox answerCheckBox1 = new JCheckBox(Quiz.QUESTION_4.getAnswer_1());
        answerCheckBox1.setBounds(30,110,500,25);
        answerCheckBox1.setFont(font2);
        panel.add(answerCheckBox1);

        JCheckBox answerCheckBox2 = new JCheckBox(Quiz.QUESTION_4.getAnswer_2());
        answerCheckBox2.setBounds(30,150,500,25);
        answerCheckBox2.setFont(font2);
        panel.add(answerCheckBox2);

        JCheckBox answerCheckBox3 = new JCheckBox(Quiz.QUESTION_4.getAnswer_3());
        answerCheckBox3.setBounds(30,190,500,25);
        answerCheckBox3.setFont(font2);
        panel.add(answerCheckBox3);

        JCheckBox answerCheckBox4 = new JCheckBox(Quiz.QUESTION_4.getAnswer_4());
        answerCheckBox4.setBounds(30,230,500,25);
        answerCheckBox4.setFont(font2);
        panel.add(answerCheckBox4);

        nextBotton4 = new JButton("Next");
        nextBotton4.setBounds(30,290,100,25);
        nextBotton4.setBackground(Color.ORANGE);
        panel.add(nextBotton4);

        nextBotton4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if(answerCheckBox1.isSelected() == Quiz.QUESTION_4.isCorrectAnswer_1() &&
                           answerCheckBox2.isSelected() == Quiz.QUESTION_4.isCorrectAnswer_2() &&
                           answerCheckBox3.isSelected() == Quiz.QUESTION_4.isCorrectAnswer_3() &&
                           answerCheckBox4.isSelected() == Quiz.QUESTION_4.isCorrectAnswer_4())
                        {
                            numberOfCorrectAnswers++;
                            JOptionPane.showMessageDialog(null,":)\nCorrect. Keep going!");
                        }
                        else
                            JOptionPane.showMessageDialog(null,":(  . . . Incorrect!\nThe correct answer is: \n " + Quiz.QUESTION_4.getAnswer_1());
                    }
                }
        );
    }

    private static void placeComponents5(JPanel panel){
        panel.setLayout(null);

        JLabel numberOfQuestionLabel= new JLabel("Question 5/5");
        numberOfQuestionLabel.setBounds(10,20,500,25);
        numberOfQuestionLabel.setFont(font1);
        panel.add(numberOfQuestionLabel);

        JLabel questionLabel = new JLabel(Quiz.QUESTION_5.getQuestion());
        questionLabel.setBounds(10,70,800,25);
        questionLabel.setFont(font2);
        panel.add(questionLabel);

        JCheckBox answerCheckBox1 = new JCheckBox(Quiz.QUESTION_5.getAnswer_1());
        answerCheckBox1.setBounds(30,110,500,25);
        answerCheckBox1.setFont(font2);
        panel.add(answerCheckBox1);

        JCheckBox answerCheckBox2 = new JCheckBox(Quiz.QUESTION_5.getAnswer_2());
        answerCheckBox2.setBounds(30,150,500,25);
        answerCheckBox2.setFont(font2);
        panel.add(answerCheckBox2);

        JCheckBox answerCheckBox3 = new JCheckBox(Quiz.QUESTION_5.getAnswer_3());
        answerCheckBox3.setBounds(30,190,500,25);
        answerCheckBox3.setFont(font2);
        panel.add(answerCheckBox3);

        JCheckBox answerCheckBox4 = new JCheckBox(Quiz.QUESTION_5.getAnswer_4());
        answerCheckBox4.setBounds(30,230,500,25);
        answerCheckBox4.setFont(font2);
        panel.add(answerCheckBox4);

        nextBotton5 = new JButton("Next");
        nextBotton5.setBounds(30,290,100,25);
        nextBotton5.setBackground(Color.ORANGE);
        panel.add(nextBotton5);

        nextBotton5.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(answerCheckBox1.isSelected() == Quiz.QUESTION_5.isCorrectAnswer_1() &&
                           answerCheckBox2.isSelected() == Quiz.QUESTION_5.isCorrectAnswer_2() &&
                           answerCheckBox3.isSelected() == Quiz.QUESTION_5.isCorrectAnswer_3() &&
                           answerCheckBox4.isSelected() == Quiz.QUESTION_5.isCorrectAnswer_4())
                        {
                            numberOfCorrectAnswers++;
                            JOptionPane.showMessageDialog(null,":)\nCorrect! Great!");
                        }
                        else
                            JOptionPane.showMessageDialog(null,":(  . . . Incorrect!\nThe correct answer is: \n " +
                                    Quiz.QUESTION_5.getAnswer_1() + "\n " + Quiz.QUESTION_5.getAnswer_2() + "\n " + Quiz.QUESTION_5.getAnswer_3());
                    }
                }
        );
    }


    private static void placeComponents6(JPanel panel){
        panel.setLayout(null);

        JLabel numberOfCorrectAnswersLabel= new JLabel("Correct answers: " + numberOfCorrectAnswers);
        numberOfCorrectAnswersLabel.setBounds(55,40,500,40);
        numberOfCorrectAnswersLabel.setFont(font1);
        panel.add(numberOfCorrectAnswersLabel);

        numberOfWrongAnswers = NUMBER_OF_QUESTIONS - numberOfCorrectAnswers;
        JLabel numberOfWrongAnswersLabel = new JLabel("Wrong answers: " + numberOfWrongAnswers);
        numberOfWrongAnswersLabel.setBounds(65,110,800,40);
        numberOfWrongAnswersLabel.setFont(font1);
        panel.add(numberOfWrongAnswersLabel);

        Integer percentage = (int)(numberOfCorrectAnswers*100)/NUMBER_OF_QUESTIONS;
        JLabel percentageLabel = new JLabel("Percentage: " + percentage+" %");
        percentageLabel.setBounds(65,180,800,40);
        percentageLabel.setFont(font1);
        panel.add(percentageLabel);

        JButton exitBotton = new JButton("Exit");
        exitBotton.setBounds(65,290,100,25);
        exitBotton.setBackground(Color.ORANGE);
        panel.add(exitBotton);
        exitBotton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
