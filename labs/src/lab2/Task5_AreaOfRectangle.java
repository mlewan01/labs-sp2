/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab2;
public class Task5_AreaOfRectangle {
    
    public static void main(String[] args) {
        double length = 3.4;
        double width = 8.4;
        System.out.println("length: " + length + "\nwidth: " + width + "\narea: " + areaOfRectangle(length, width));
    }
    
    /**
    * Computes the sum of two arguments.
    *
    * @param a an double operand to be multiplied
    * @param b another double operand to be multiplied
    * @return the product of a and b
    */
    public static double areaOfRectangle(double a, double b) {
        return a*b;
    }
}
