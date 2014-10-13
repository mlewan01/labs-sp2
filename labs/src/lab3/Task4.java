/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many radom numbers should be generated?");
        int nr = sc.nextInt();
        System.out.println("What is the number of values for each random draw?");
        int rand = sc.nextInt();
        int[] ai = new int[rand];
        for(int i = 0; i<nr; i++){
            int some =  new Random().nextInt(rand);
            ai[some]++;
        }
        for(int j=0;j<ai.length; j++){
            System.out.println(j+ "   " + ai[j]);
        }
    }
}
