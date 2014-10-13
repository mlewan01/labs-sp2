/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

package lab3;

import java.util.ArrayList;

public class Task6_PenAndPaper {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("P");
        list.add("Q");
        list.add("R");
        list.set(2,"s");
        list.add(2,"T");
        list.add("u");
        System.out.println(list);
    }
}
