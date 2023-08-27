package com.company;

public class CWH_012_PS_Q2
{
    public static void main(String[] args)
    {
        // write a java program to encrypt a grade by adding 8 to it.
        // Decrypt it to show a correct grade

        // Encryption
        char grade = 'C';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decryption
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
