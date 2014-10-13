package lab2;


import java.util.Scanner;

/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

public class Task1_Gauss {
    public static void main(String[] arg){
        
        Scanner s = new Scanner(System.in);
        System.out.println("please enter amount of loops");
        int j = s.nextInt();
        int sum = 0;
        for(int i=1;i<=j;i++){
            sum+=i;
            //System.out.println(i);
        }
        int ii = 1;
        int sum2 = 0;
        while(ii<=j){
            sum2+=ii;
            ii++;
        }
        System.out.println("loop \"for\" sum   : " + sum);
        System.out.println("loop \"while\" sum   : " + sum2);
        
        System.out.println("\n Gauss method:  ");
        System.out.println(gauss(j));
    }
    
    public static int gauss(int i){
        System.out.println("gauss: "+i);
        if(i == 0) return 0;
        return i + gauss(--i);
    }
}
