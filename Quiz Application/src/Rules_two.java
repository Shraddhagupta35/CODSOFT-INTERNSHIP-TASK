import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules_two extends JFrame implements ActionListener {

    String name;
    JButton start , back;

    Rules_two(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " To Quiz World!");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Mongolian Baiti" , Font.BOLD, 28));
        heading.setForeground(new Color(30 , 144 ,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma" , Font.PLAIN, 16));
        rules.setText(
            "<html>" +
                "1. You are trained to be a programmer and not a story tailler , answer point to point. " +"<br><br>" +
                "2. Do not unnecessary smile at the person sitting next to you , they may also not know the answer. " + "<br><br>" +
                "3. You may have lot of option in life but here all the questions are complusary. " + "<br><br>" +
                "4. Crying is allowedbut please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answer (Be wise , not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions." + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted." + "<br><br>" +
                "8. may you know more than what Rabbit knows, Good Luck. " + "<br><br>" +
            "<html>"

        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250 , 500 ,100 , 30);
        back.setBackground(new Color(30 , 144, 254));
        back.setForeground(Color.PINK);
        back.addActionListener(this);
        add(back);


        start = new JButton("Start");
        start.setBounds(400 , 500 ,100 , 30);
        start.setBackground(new Color(30 , 144, 254));
        start.setForeground(Color.PINK);
        start.addActionListener(this);
        add(start);


        setSize(800 , 650);
        setLocation(350 , 100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == start){
            setVisible(false);
            new Quizs_Three(name);

        }else{
            setVisible(false);
            new LoginQuiz_One();
        }
    }

    public static void main(String[] args) {
        new Rules_two("User");
    }

    
}

    

