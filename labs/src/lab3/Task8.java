/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab3;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args){
        int[] a1 = {1,8,4,13,99,23,17,7,25};
        int[] a2 = { 13, 47, 200, 53, 0, 100, 33, 8, 31, 75, 123, 47, 99 };
        
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        insert(a1, al1);
        //System.out.println("first arrayList:   " + al1.toString());
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        insert(a2, al2);
        System.out.println("second arrayList:  " + al2.toString());
        
        System.out.println("combined: " + merge(al1,al2));
    }
    public static ArrayList<Integer> merageSort(ArrayList<Integer> arr){
        
        return arr;
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> al1, ArrayList<Integer> al2){
         ArrayList<Integer> al = new ArrayList<Integer>(al1);
         al.addAll(al2);
        return al;
    }
    public static void insert(int[] ii, ArrayList<Integer> al){
        for(int i =0; i<ii.length; i++){
            al.add(ii[i]);
        }
    }
}
