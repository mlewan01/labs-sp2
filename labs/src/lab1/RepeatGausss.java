/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;

import java.util.Scanner;

public class RepeatGausss {
    public static void main(String[] arg){
        
        Scanner s = new Scanner(System.in);
        System.out.println("please enter amount of loops");
        int j = s.nextInt();
        int sum = 0;
        for(int i=1;i<=j;i++){
            sum+=i;
            //System.out.println(i);
        }
        System.out.println(sum);
    }
}
