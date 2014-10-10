/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] arg){
        boolean loop = true; 
        Scanner s = new Scanner(System.in);
        int total = 0;
        String t="";
        while(loop){
            System.out.println("Please enter a number: positive, negative or zero");
            System.out.println("enter \"q\" to exit loop");
            if(s.hasNext()) {
                t=s.next();
                if (t.equals("q")) loop = false;
                else total+=Integer.parseInt(t);
            }
        }
        System.out.println("the total of entred numvbers is:  " + total);
    }
}
