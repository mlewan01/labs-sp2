/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab3;
public class Task2_Arrays2 {
    public static void main(String[] args) {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("Before rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        x = rotate(x, 3);
        System.out.println("After rotation: ==============================");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]: " + x[i]);
        }
    }
    /**
     * will rotate elements of the given array given amount of times
     * @param d the array elements to be rotate
     * @param i amount of rotations
     * @return  array with rotated elements 
     */
    public static double[] rotate(double[] d, int i){
        if(i==0)return d;
        double[] x = new double[d.length];
        System.arraycopy(d, 1, x, 0, d.length-1);
        x[x.length-1] = d[0];
        i--;
        return rotate(x,i);
    }
}
