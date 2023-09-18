package com.company;

import javax.script.ScriptContext;
import java.util.Scanner;

public class CWH_29_practice_set_6
{
    public static void main(String[] args)
    {
        Scanner take = new Scanner(System.in);
        // Q1. Create an array of 5 floats and calculate their sum
        /*
        float sum = 0;
        float [] arr = new float[5];
        for(int i = 0; i < arr.length; i++)
        {
            System.out.printf("Enter Element%d: ", i);
            arr[i] = take.nextFloat();
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        */

        // Q2. write a java program to find out whether a given integer is present in array or not
        /*
        int [] random = {1, 53, 52, 64, 4};
        int num = 52;
        boolean isMacthed = false;

        for(int i = 0; i < 5; i++)
        {
            if(num == random[i])
            {
                isMacthed = true;
            }
        }

        if (isMacthed)
        {
            System.out.println("Number is available in array.");
        }
        else
        {
            System.out.println("Number is not available in array.");
        }
         */

        // Q3. Calculate the average marks from an array containing marks of all students in physics using for-each loop

        /*
        float sum = 0;
        float [] arr = {1, 2, 34, 5, 8};
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println("Avg = " + sum / arr.length);
         */

        // Q4. Create a java program to add 2 matrices of size 2 X 3
        /*int mat [] [] = {{1, 2, 3},
                         {4, 5, 6}};

        int mat2 [] [] = {{6, 5, 4},
                          {3, 2, 1}};

        int [] [] mat3 = new int [2] [3];

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                mat3 [i] [j] = mat [i] [j] + mat2 [i] [j];
                System.out.print(mat3 [i] [j] + " ");
            }
            System.out.println("");
        }*/

        // Q5. Write a java program to reverse an array.
        /*int [] marks = {1, 3, 4, 2};
        int temp;

        for(int i = 0; i < (marks.length/2); i++)
        {
            temp = marks[i];
            marks[i] = marks[marks.length - 1 - i];
            marks[marks.length - 1 - i] = temp;
        }

        for (int mark : marks)
        {
            System.out.println(mark);
        }*/

        // Q6. write a java program to find the maximum element in an array
        /*int [] marks = {4, 3, 2, 5};
        int max = Integer.MIN_VALUE;
        for (int mark : marks)
        {
            if (mark > max)
            {
                max = mark;
            }
        }
        System.out.printf("Maximum number in array is %d\n", max);*/

        // Q7. write a java program to find the minimum element in an array.
        /*int [] marks = {4, 3, 2, 5};
        int min = Integer.MAX_VALUE;
        for (int mark : marks)
        {
            if(mark < min)
            {
                min = mark;
            }
        }
        System.out.printf("Minimum number in array is %d\n", min);*/

        // Q8. write a java program to find whether an array is sorted or not.
        int [] marks = {1, 3, 4, 5};
        boolean isSorted = true;
        for(int i = 0; i < marks.length - 1; i++)
        {
            if(marks[i] > marks[i + 1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("Array is Sorted");
        }
        else
        {
            System.out.println("Array is not Sorted");
        }
    }
}
