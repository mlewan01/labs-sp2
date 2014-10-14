/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int j=0;
        System.out.println("please enter an integer, enter -1 to finish entering!");
        while((j=sc.nextInt()) != -1){
            System.out.println("please enter an integer, enter -1 to finish entering!");
            if(j == -1)break;
            al.add(j);
        }
        System.out.println("number of elements entered to the ArrayList: "+al.size());
        
        System.out.println("Avarege of the input numbers: ");
        int sum = 0;
        for(int x: al){
            sum +=x;
        }
        System.out.println("sum is:  "+ sum+ "  average is:  " +(0.0+sum/al.size()));
        System.out.println("Standard deviation of values from array: ");
        System.out.println(standardDeviation(al));
        System.out.println("Sum of the odd numbers: ");
        System.out.println(sumOdd(al));
    }
    public static double standardDeviation(ArrayList<Integer> al){
        int aver=0, sum=0;
        for(int i:al){
            if(i%2 == 0)sum+=i;
        }
        aver = sum/al.size();
        for(int i: al){
            sum += Math.pow(i-aver,2);
        }
        return Math.sqrt(sum);
    }
    public static int sumOdd(ArrayList<Integer> al){
        int sum = 0;
        for(int i:al){
            if(i%2!=0)sum += i;
        }
        return sum;
    }
}