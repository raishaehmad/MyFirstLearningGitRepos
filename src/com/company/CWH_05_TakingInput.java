package com.company;
import java.util.Scanner;

public class CWH_05_TakingInput
{
    public static void main(String[] args)
    {
        int a;
        // float a;
        int b;
        // float b;
        System.out.println("-------Taking Input-------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        a = sc.nextInt();
        //a = sc.nextFloat();
        System.out.println("Enter Number 2: ");
        b = sc.nextInt();
        //b = sc.nextFloat();
        int sum = a + b;
        // float sum = a + b;
        System.out.println("Sum of three number is: " + sum);
        // or
        //System.out.println("Sum of three number is: ");
        //System.out.println(sum);
        //boolean b1 = sc.hasNextInt();
        //System.out.println(b1);
        //String s = sc.next(); // this sc.next() reads only one word
        //String s = sc.nextLine(); // this reads line
        //System.out.println(s);
    }
}
