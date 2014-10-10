/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;

public class Luhan2 {
    public static void main(String[] args) {
        //int num = 2315778;
        //System.out.println("CC number: " + num + " is " + checkDigits(num));
        int num = 2315778;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1234567;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 7654321;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1111111;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
    }
    public static String checkDigits(int number) {
        String s = number+"";
        int sum = 0;
        boolean b = false;
        for(int i=s.length(); i> 0;i--){
            int j = Integer.parseInt((s.charAt(i-1))+"");
            int d =decode(j,b);
            sum+=d;
            b = !b;
            //System.out.println(j+" will after check: " +d);
        }
        //System.out.println("the sum:  " +sum);
        //System.out.println(sum%10);
        if(sum%10 == 0) return "valid";
        return "invalid";
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
