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
    public static int gcd(int r, int l){
        System.out.println("inside GCD : " + r + "   " + l);
        if(r==0 || l==0){
            return r==0? l:r;
        }
        if(r<=l){
            gcd(r,l-r);
        }else gcd(r-l, l);
        
        return r==0? l:r;
    }
}
