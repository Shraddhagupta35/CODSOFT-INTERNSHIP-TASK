import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quizs_Three extends JFrame implements ActionListener {

    String ques[][] = new String[10][5];
    String ans[][] = new String[10][2];
    String userans[][] = new String[10][1];
    JLabel qno , question;
    JRadioButton opt1 , opt2, opt3, opt4;
    ButtonGroup groupOption;
    JButton next , submit , lifeline;
  

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;

    Quizs_Three(String name){
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.pink);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);

        qno = new JLabel();
        qno.setBounds(100, 450, 50 , 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tohoma" , Font.PLAIN, 24));
        add(question);


        ques[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        ques[0][1] = "JVM";
        ques[0][2] = "JDB";
        ques[0][3] = "JDK";
        ques[0][4] = "JRE";

        ques[1][0] = "What is the return type of the hashCode() method in the Object class?";
        ques[1][1] = "int";
        ques[1][2] = "Object";
        ques[1][3] = "long";
        ques[1][4] = "void";

        ques[2][0] = "Which package contains the Random class?";
        ques[2][1] = "java.util package";
        ques[2][2] = "java.lang package";
        ques[2][3] = "java.awt package";
        ques[2][4] = "java.io package";

        ques[3][0] = "An interface with no fields or methods is known as?";
        ques[3][1] = "Runnable Interface";
        ques[3][2] = "Abstract Interface";
        ques[3][3] = "Marker Interface";
        ques[3][4] = "CharSequence Interface";

        ques[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        ques[4][1] = "Stack";
        ques[4][2] = "String memory";
        ques[4][3] = "Random storage space";
        ques[4][4] = "Heap memory";

        ques[5][0] = "Which of the following is a marker interface?";
        ques[5][1] = "Runnable interface";
        ques[5][2] = "Remote interface";
        ques[5][3] = "Readable interface";
        ques[5][4] = "Result interface";

        ques[6][0] = "Which keyword is used for accessing the features of a package?";
        ques[6][1] = "import";
        ques[6][2] = "package";
        ques[6][3] = "extends";
        ques[6][4] = "export";

        ques[7][0] = "In java, jar stands for?";
        ques[7][1] = "Java Archive Runner";
        ques[7][2] = "Java Archive";
        ques[7][3] = "Java Application Resource";
        ques[7][4] = "Java Application Runner";

        ques[8][0] = "Which of the following is a mutable class in java?";
        ques[8][1] = "java.lang.StringBuilder";
        ques[8][2] = "java.lang.Short";
        ques[8][3] = "java.lang.Byte";
        ques[8][4] = "java.lang.String";

        ques[9][0] = "Which of the following option leads to the portability and security of Java?";
        ques[9][1] = "Bytecode is executed by JVM";
        ques[9][2] = "The applet makes the Java code secure and portable";
        ques[9][3] = "Use of exception handling";
        ques[9][4] = "Dynamic binding between objects";
        
        ans[0][1] = "JDB";
        ans[1][1] = "int";
        ans[2][1] = "java.util package";
        ans[3][1] = "Marker Interface";
        ans[4][1] = "Heap memory";
        ans[5][1] = "Remote interface";
        ans[6][1] = "import";
        ans[7][1] = "Java Archive";
        ans[8][1] = "java.lang.StringBuilder";
        ans[9][1] = "Bytecode is executed by JVM";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupOption = new ButtonGroup();
        groupOption.add(opt1);
        groupOption.add(opt2);
        groupOption.add(opt3);
        groupOption.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupOption.getSelection() == null) {
               userans[count][0] = "";
            } else {
                userans[count][0] = groupOption.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupOption.getSelection() == null) {
                userans[count][0] = "";
            } else {
                userans[count][0] = groupOption.getSelection().getActionCommand();
            }

            for (int i = 0; i < userans.length; i++) {
                if (userans[i][0].equals(ans[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score_Four(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupOption.getSelection() == null) {
                   userans[count][0] = "";
                } else {
                    userans[count][0] = groupOption.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < userans.length; i++) {
                    if (userans[i][0].equals(ans[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score_Four(name, score);
            } else { // next button
                if (groupOption.getSelection() == null) {
                   userans[count][0] = "";
                } else {
                    userans[count][0] = groupOption.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(ques[count][0]);
        opt1.setText(ques[count][1]);
        opt1.setActionCommand(ques[count][1]);
        
        opt2.setText(ques[count][2]);
        opt2.setActionCommand(ques[count][2]);
        
        opt3.setText(ques[count][3]);
        opt3.setActionCommand(ques[count][3]);
        
        opt4.setText(ques[count][4]);
        opt4.setActionCommand(ques[count][4]);
        
        groupOption.clearSelection();
      //  setVisible(true);
    }
    
    public static void main(String[] args) {
        new Quizs_Three("user");
    }
}
