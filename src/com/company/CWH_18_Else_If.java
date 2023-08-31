package com.company;

import java.util.Scanner;

public class CWH_18_Else_If
{
    public static void main(String[] args)
    {
        int age;
        Scanner take = new Scanner(System.in);
        age = take.nextInt();
        // Switch case
        switch (age)
        {
            case 18:
                System.out.println("You are playing 18+games");
                break;
            case 24:
                System.out.println("You are joining job");
                break;
            case 70:
                System.out.println("You are free from world");
                break;
            default:
                System.out.println("Enjoy Life");
        }
        // this is enhanced Switch
        //Switch (age) {
        //    case 18 -> System.out.println("You are playing 18+games");
        //    case 24 -> System.out.println("You are joining job");
        //    case 70 -> System.out.println("You are free from world");
        //    default -> System.out.println("Enjoy Life");
        //}

        // if-else if- else ladder
        if (age > 56) {
            System.out.println("You are Above 56");
        }
        else if (age > 46)
        {
            System.out.println("Your Age Greater Than 46");
        }
        else
        {
            System.out.println("Your Age is < 46");
        }
    }
}
