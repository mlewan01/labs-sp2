/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;
public class Task10 {
    public static void main(String[] arg){
        
        starPrint(6);
        starPrint(20);
        starPrint(2);
        starPrint(1);
    }
    public static void starPrint(int n){
        if (n > 10) System.out.print("***** ");
        if (n > 7) System.out.print("**** ");
        if (n > 4) System.out.print("*** ");
        if (n > 1) System.out.print("** ");
        System.out.println("*   ");
    }
}
