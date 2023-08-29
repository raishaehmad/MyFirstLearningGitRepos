package com.company;

import java.util.Scanner;

public class CWH_15_PS_Q3
{
    public static void main(String[] args)
    {
        // write a java program to fill a Letter template looks like below:
        // letter = "Dear <|name|>, thanks a lot"
        // Replace <|name|> with a string (some name).
        Scanner take = new Scanner(System.in);
        String letter = "Dear <|name|>, thanks a lot";
        System.out.print("Enter Your name: ");
        String name = take.next();
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}
