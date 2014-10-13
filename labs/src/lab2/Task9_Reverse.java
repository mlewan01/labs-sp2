/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab2;
public class Task9_Reverse {
    
    public static void main(String[] args){
        String word = "abcdefg";
        System.out.println("Word: " + word);
        System.out.println("Word reversed: " + reverse(word));
    }
    public static String reverse(String s){
        if(s.length() == 1) return s;
        char c = s.charAt(0);
        return reverse(s.substring(1))+c;
    }
}
