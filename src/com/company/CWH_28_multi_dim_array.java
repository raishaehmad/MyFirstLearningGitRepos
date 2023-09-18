package com.company;

public class CWH_28_multi_dim_array
{
    public static void main(String[] args)
    {
        // array
        int [] [] _2d = new int [2] [3];
        _2d [0] [0] = 101;
        _2d [0] [1] = 102;
        _2d [0] [2] = 103;
        _2d [1] [0] = 201;
        _2d [1] [1] = 202;
        _2d [1] [2] = 203;

        for(int i = 0; i < _2d.length; i++)
        {
            for(int j = 0; j < _2d[i].length; j++)
            {
                System.out.printf("%d " ,_2d[i] [j]);
            }
            System.out.printf("\n");
        }
    }
}
