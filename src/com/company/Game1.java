package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game1
{
    public static void main(String[] args)
    {
        Scanner take = new Scanner(System.in);

        String user;
        String Computer = "Initial";
        int ranNumber;

        // generating random number
        Random random = new Random();
        ranNumber = random.nextInt(99);
        //System.out.println("Random Number is " + ranNumber); // to check random number is generating

        // assigning input to computer based on random number
        if(ranNumber > 0 && ranNumber <= 33)
        {
            Computer = Computer.replace("Initial", "Stone");
        }
        else if(ranNumber > 33 && ranNumber <= 66)
        {
            Computer = Computer.replace("Initial", "Paper");
        }
        else if(ranNumber > 66 && ranNumber < 100)
        {
            Computer = Computer.replace("Initial", "Scissor");
        }
        //System.out.println("Computer Chosen " + Computer);

        // Taking input from the user
        System.out.println("Enter Stone or Paper or Scissor");
        user = take.next();

        if(Computer.equalsIgnoreCase(user))
        {
            System.out.println("Computer Chosen " + Computer + " You Chosen " + user);
            System.out.println("Match Tie!");
        }
        else if(Computer.equalsIgnoreCase("Stone") && user.equalsIgnoreCase("Paper"))
        {
            System.out.println("Computer Chosen " + Computer + " You Chosen " + user);
            System.out.println("You Win.");
        }
        else if(Computer.equalsIgnoreCase("Paper") && user.equalsIgnoreCase("Stone"))
        {
            System.out.println("Computer Chosen " + Computer + " You Chosen " + user);
            System.out.println("You Lose.");
        }
        else if(Computer.equalsIgnoreCase("Paper") && user.equalsIgnoreCase("Scissor"))
        {
            System.out.println("Computer Chosen " + Computer + " You Chosen " + user);
            System.out.println("You Win.");
        }
        else if(Computer.equalsIgnoreCase("Scissor") && user.equalsIgnoreCase("Paper"))
        {
            System.out.println("Computer Chosen " + Computer + " You Chosen " + user);
            System.out.println("You Lose.");
        }
        else if(Computer.equalsIgnoreCase("Scissor") && user.equalsIgnoreCase("Stone"))
        {
            System.out.println("Computer Chosen " + Computer + " You Chosen " + user);
            System.out.println("You Win.");
        }
        else if(Computer.equalsIgnoreCase("Stone") && user.equalsIgnoreCase("Scissor"))
        {
            System.out.println("Computer Chosen " + Computer + " You Chosen " + user);
            System.out.println("You Lose.");
        }
    }
}
