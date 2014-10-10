/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;
public class Task31 {
    public static void main(String[] args){
        
        double length = 3.4;
        double width = 8.4;
        System.out.println("lenght : " + length);
        System.out.println("width  : " + width);
        System.out.println("Area : " + AreaOfRectangle(length, width));
        
    }
    
    /**
    * Returns an area of the rectangle. method accepts two float-point variable.
    * 
    * @param length represents length of the rectangle 
    * @param width represents width of the rectangle
    * @return area of the rectangle with the given length and width
    */
    public static double AreaOfRectangle(double length, double width){
        return length*width;
    }
}
