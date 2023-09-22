package com.company;

public class CWH_31_methods
{

    static int logic(int x, int y)
    {
        int z;
        if(x > y)
        {
            z = x;
        }
        else
        {
            z = y;
        }
        return z;
    }
    public static void main(String[] args)
    {
        int a = 5;
        int b = 6;
        //CWH_31_methods obj = new CWH_31_methods();
        //int max = obj.logic(a, b);
        int max = logic(a, b);
        System.out.println(max);
    }
}
