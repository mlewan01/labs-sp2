/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Please, enter an integer:");
        int i = s.nextInt();
        System.out.println("Please, enter an integer:");
        int j = s.nextInt();
        
        System.out.println("The biggest entred valuse is:\n"+Math.max(i,j));
    }
}
