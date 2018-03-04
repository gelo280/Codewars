package pl.samouczekprogramisty.kursjava.codewars;
/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
 */

public class SumOfOddNumbers {

    public static int rowSumOddNumbers(int n) {
        int a = 1;
        int b = 1;
        int suma = 0;

        for(int i = 1 ; i < n ; i++) {
            a =+ i;
        }

        b = a*2 - 1;

        suma = b;

        for(int i=1;i<n;i++) {
            b = b + 2;
            suma = suma+b;

        }
        return suma;
    }
}

