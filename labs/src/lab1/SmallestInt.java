/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;

import java.util.Scanner;

public class SmallestInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        int x = scan.nextInt();
        System.out.println("Enter a value for y:");
        int y = scan.nextInt();
        System.out.println("Enter a value for z:");
        int z = scan.nextInt();
        if (x <= y && x <= z) {
            System.out.println("The smallest value was " + x);
        } else if (y <= z){
            System.out.println("The smallest value was " + y);
        }else System.out.println("The smallest value was " + z);
    }
}
