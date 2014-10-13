/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab2;
public class Task6_Area {
    
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println("x: " + x + " y: " + y + " Sum: " + sum(x, y));
    }
    /**
    * Computes the sum of two arguments.
    *
    * @param a
    * an int operand to be added
    * @param b
    * another int operand
    * @return the sum of a and b
    */
    public static int sum(int a, int b) {
        a = 5;
        b = 6;
        return a + b;
    }
}
// changes to the variables in the method sum wont affect variables outside that method!
