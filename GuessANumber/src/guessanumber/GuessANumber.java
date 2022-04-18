package guessanumber;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class GuessANumber {
    public static void main(String[] args)
    {
        System.out.println("***********************************************************");
        System.out.println("             Guess A Number Between 0-100                  ");
        System.out.println("***********************************************************");
        System.out.println();
        
        Random rand = new Random();
        int random_number = rand.nextInt(99)+1;
        Scanner SC = new Scanner(System.in);
        System.out.println("Pick a number between 0 and 100 (   You have 3 guesses   ): ");
        int guess;
        int numberOfTries = 1;
        boolean win =false;
        while(win == false)
        {
            guess = SC.nextInt();
            
            if(numberOfTries < 3)
            {    
            
                if(guess == random_number)
                {
                   System.out.println();
                   System.out.println("Correct...You Won!! The number is " + random_number);
                   System.out.println("It took you " + numberOfTries + "guess to get it right!");
                   SC.close();
                   win = true;
                }
                else if (guess < random_number)
                {
                   System.out.println("Nope! The number is higher.");
                   System.out.println();
                   System.out.println("Guess Again:");
                }
                else if (guess > random_number)
                {
                   System.out.println("Nope! the number is Lower");
                   System.out.println();
                   System.out.println("Guess Again: ");
                }
            }
            else if (numberOfTries == 3)
            {
                if(guess == random_number)
                {
                    System.out.println();
                    System.out.println("You Won!! The number is " + random_number);
                    System.out.println("It only took you " + numberOfTries + "guesses to get it right!");
                    SC.close();
                    win = true;
                }
                if (guess != random_number)
                {
                    System.out.println();
                    System.out.println("Sorry you ran out of Attempts.\nThe correct number is: " + random_number + "\nBetter luck next time!");
                    SC.close();
                    break;
                }
            }
            numberOfTries = numberOfTries + 1;
        }
        switch (numberOfTries) {
            case 1:
                System.out.println("Your Score\n    ***** \nCongratulations!!!");
                break;
            case 2:
                System.out.println("Your Score\n    *** \nCongratulations!!");
                break;
            default:
                System.out.println("Your Score\n    * \nCongratulations!");
                break;
        }
    }
}
