import javax.swing.*;

public class Guessing_game {

    public static void main(String[] args) {

        int compNum = (int)(Math.random()*100+1);
        int userAns = 0;
        System.out.println("the correct Guess would be : " +compNum);
        int count = 1;

        while(userAns != compNum){

            String response = JOptionPane.showInputDialog(null , "Enter a guess between 1 to 100" , "Guessing Game" , 3);
            userAns = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, " " +  determineGuess(userAns, compNum, count));
            count++;

        }

    }

    public static String determineGuess(int userAns , int compNum , int count){

        if(userAns <= 0 || userAns > 100){
            return "Your guess is valid";
        }else if(userAns == compNum){
            return "Won ! \n Total Guesses :" +count;
        }else if(userAns > compNum){
            return "Your guess is too high , try again , \n Try Number : " +count; 
        }else{
            return "Your guess is too low \n Try Number : " +count;
        }
    }
    
}
