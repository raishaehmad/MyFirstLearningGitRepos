package com.company;

public class CWH_27_array
{
    public static void main(String[] args)
    {
        String [] student = {"sdf", "eaf", "ads"};
        System.out.println(student.length);

        for(int i = 0; i < student.length; i++)
        {
            System.out.println(student[i]);
        }

        // Quick Quiz print student in reverse order
        for (int i = student.length - 1; i >= 0; i--)
        {
            System.out.println(student[i]);
        }

        // Enhanced for loop or for-each loop
        for (String s : student) {
            System.out.println(s);
        }
    }
}
