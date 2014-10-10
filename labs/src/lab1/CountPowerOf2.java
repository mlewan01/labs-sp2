/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;

import java.util.Scanner;

/**
Program to compute the first integral power to which 2 can be
raised that is greater than that multiple of a given integer.
*/

public class CountPowerOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number, 0 to quit: ");
        int n = in.nextInt();
        int i = 1;
        //while (n * n > Math.pow(2, i))
        for(; n*n > Math.pow(2,i); i++){}
        //i++;
        System.out.println("2 raised to " + i
        + " is the first power of two greater than " + n + " squared");
    }
}
