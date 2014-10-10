/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;
public class Luhn {
    public static void main(String[] args) {
        boolean even = false;
        System.out.println(decode(1, even));
        System.out.println(decode(2, even));
        System.out.println(decode(3, even));
        System.out.println(decode(4, even));
        System.out.println(decode(5, even));
        System.out.println(decode(6, even));
        System.out.println(decode(7, even));
        System.out.println(decode(8, even));
        System.out.println(decode(9, even));
        even = ! even;
        System.out.println(decode(1, even));
        System.out.println(decode(2, even));
        System.out.println(decode(3, even));
        System.out.println(decode(4, even));
        System.out.println(decode(5, even));
        System.out.println(decode(6, even));
        System.out.println(decode(7, even));
        System.out.println(decode(8, even));
        System.out.println(decode(9, even));
    }
    public static int decode(int digit, boolean position) {
        if(position){
            digit *=2;
            if(digit>9){
                int t = digit%10;
                digit=t+1;
            }
        }
    return digit;
    }
}
