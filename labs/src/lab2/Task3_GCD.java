/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab2;

import java.util.Scanner;

public class Task3_GCD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int x  = in.nextInt();
        System.out.println("x = " + x);
        System.out.println("Enter the second integer: ");
        int y = in.nextInt();
        System.out.println("y = " +y);
        in.close();
        
        System.out.println("the GCD of the two given numbers is: ");
        System.out.println(gcd(x,y));
        
    }
    /**
     * function is calculating the Greatest Common Divisor of two given integers
     * @param r first given integer 
     * @param l second given integer
     * @return the greatest common divisor
     */
    public static int gcd(int r, int l){
        int some = 0;
        System.out.println("inside GCD : " + r + "   " + l);
        if(r==0 || l==0){
            return some = r<l?l:r;
        }
        if(r<=l){
            some = gcd(r,l-r);
        }else some = gcd(r-l, l);
        
        return some;
    }
}
