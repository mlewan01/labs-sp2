/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;
public class BadIfs {
    public static void main(String[] args) {
        int x = 9;
        int y = 3;
        int z = 7;
        
        if (x < y){
            System.out.println("aaa"); 
            if (x < z){
                System.out.println("bbb");
            }
        } else {
            System.out.println("ccc");
        }
        System.out.println("ddd");
        if (y > z){
            if (z > x){
                System.out.println("eee");
            }else System.out.println("fff");
        }else{
            System.out.println("ggg");
        }
    }
}
