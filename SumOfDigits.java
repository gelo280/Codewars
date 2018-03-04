package pl.samouczekprogramisty.kursjava.codewars;

/*In this kata, you must create a digital root function.

A digital root is the recursive sum of all the digits in a number. Given n,
 take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.*/

public class SumOfDigits {

        public static int digital_root(int n) {

            String h=String.valueOf(n);
            int suma = 0;

            while(h.length() > 1) {
                suma = 0;

                for(int i = 0 ;i< h.length() ; i++) {
                    suma += Character.getNumericValue( h.charAt( i ) );
                }

                h=String.valueOf( suma );

            }
            return suma;
        }

    }



