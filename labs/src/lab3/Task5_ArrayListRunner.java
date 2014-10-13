/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab3;

import java.util.ArrayList;

public class Task5_ArrayListRunner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("after adding names: " + names);
        System.out.println("first name with get: "+names.get(0));
        System.out.println("last name with the get: "+names.get(names.size()-1));
        names.set(0,"Alice B Toklas");
        System.out.println("list after change to first element: "+names);
        names.add(4, "Doug");
        System.out.println("printing the list with the enchanced for loop !!!:");
        for(String s: names){
            System.out.println(s);
        }
        
        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println("printing array 2: "+names2);
        names.remove(0);
        System.out.println("printing array 1: "+names);
        System.out.println("printing array 2: "+names2);
    }
}
