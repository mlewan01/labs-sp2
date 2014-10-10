/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;
public class Expressions {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        System.out.println((a + b) / c);
        // 3 and 4 are added with sum 7
        // 7 is divided by 5 with quotient 1
        System.out.println(a + b / c);
        // 4 is divided by 5 with quotient 0
        // 3 is added to 0 with sum 3
        System.out.println(a++);
        // 3 is incremented by 1 with sum 4
        System.out.println(a--);
        // 4 is decremented by 1 with difference 3
        System.out.println(a + 1);
        // 3 and 1 are added with sum 4
        System.out.println(d % c);
        // 17 is divided by 5 with remainder 2
        System.out.println(d / c);
        // 17 is divided by c with quotient 3
        System.out.println(d % b);
        // 17 is divided by 4 with remainder 1
        System.out.println(d / b);
        // 17 is divided by 4 with quotient 4
        System.out.println(d + a / d + b);
        // 3 is divided by 4 with quotient 0
        // 17 is added to 0 with sum 17
        // 17 is added to 4 with sum 21
        System.out.println((d + a) / (d + b));
        // 17 is added to 3 with sum 20
        // 17 is added to 4 with sum 21
        // 20 is divided by 21 with quotient 0
        System.out.println(Math.sqrt(b));
        // squer root from 4 equals 2
        System.out.println(Math.pow(a, b));
        // 3 to the power of 4 
        System.out.println(Math.abs(-a));
        // absolute value from -3 equals 3
        System.out.println(Math.max(a, b));
        // the lagest from (3,4) is 3
    }
}