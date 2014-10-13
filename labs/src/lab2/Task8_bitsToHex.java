/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab2;
public class Task8_bitsToHex {
    public static void main(String[] args){
        byte a = 15;
        byte b = 9;
        byte c = 10;
        
        System.out.println(bitsToHex(a));
        System.out.println(bitsToHex(b));
        System.out.println(bitsToHex(c));
    }
    /**
     * methods will convert right most 4 bits of a bit in to hexadecimal form
     * @param b the value in byte form to be converted to hexadecimal
     * @return a string representing a single hexadecimal symbol
     */
    public static String bitsToHex(byte b){
        String[] s = {"A", "B", "C", "D","E","F"};
        if(b>=0 && b<=9){
            return b+"";
        }else return s[b-10];
    }
}
