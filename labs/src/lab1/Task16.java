/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab1;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("type value for string s1");
        //String s1 = sc.next();\
        String s1 = "abcd";
        System.out.println("type value for string s2");
        //String s2 = sc.next();
        String s2 = "wxyz";
        System.out.println("type value for string s3");
        //String s3 = sc.next();
        String s3 = "pqrs";
        if (s1.compareTo(s2) <= 0){
            if(s2.compareTo(s3) <=0){
                System.out.println("s2 is the middlest  " + s2);
            }else System.out.println("s3 is the middlest  " + s3);
        }else {
            if(s1.compareTo(s3) <= 0){
                System.out.println("s1 is the middlest  " + s1);
            }else System.out.println("s3 is the smolest  " + s3);
        }
    }
        
}
