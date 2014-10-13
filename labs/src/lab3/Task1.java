/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab3;
public class Task1 {
    public static void main(String[] args){
        double[] x = {8,4,5,21,7,9,18,100};
        
        System.out.println("Number of elements in the array \"x\": "+ x.length);
        System.out.println("First element in array \"x\": " + x[0]);
        System.out.println("Last element in the array \"x\": " + x[x.length-1]);
        System.out.println(" x[x.length -1]: " + x[x.length-1]);
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        for(int i=0; i<x.length; i++){
            System.out.println("x[" +i+"]: " + x[i]);
        }
        for(int i=x.length-1; i>=0; i--){
            System.out.println("x[" +i+"]: " + x[i]);
        }
        for(double d: x){
            System.out.println(d);
        }
    }
}
