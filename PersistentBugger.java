package pl.samouczekprogramisty.kursjava.codewars;
/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 which is the number of times you must multiply the digits in num until you reach a single digit.
 */

public class PersistentBugger {

    public static int persistence(long n) {

        int c = (int)n;
        int x;
        int licznik = 0;
        int suma = 1;
        String b = String.valueOf(c);


        while(b.length() > 1)  {

            for(int i=0 ; i < b.length(); i++) {
                x=b.charAt( i ) -48;

                suma = suma * x;
            }
            b=String.valueOf( suma );
            licznik++;
            suma = 1;
        }

        return licznik;
    }
}
