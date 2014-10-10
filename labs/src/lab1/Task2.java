package lab1;


import java.lang.reflect.Field;

/*
 * Copy rights Mariusz Lewandowski
 * http://www.artemlux.com
 * @author: mlwan01 <Mariusz Lewandowski, Student ref: 12906023>
 * class: sp2-2014
 */

public class Task2 {
    
        byte    v1 = 127;
        short   v2 = 32767;
        int     v3 = 2000000000;
        long    v4 = 666;
        float   v5 = 6;
        double  v6 = 8.8;
        char    v7 = 68;
    
    public static void main(String[] args){
        
        Task2 t = new Task2();
        printF(t);
        t.v1 = 111; t.v2=111; t.v3=111; t.v4=111; t.v5=111; t.v6=111; t.v7=111;
        printF(t);
        
        final byte    v1 = 127;
        final short   v2 = 32767;
        final int     v3 = 2000000000;
        final long    v4 = 666;
        final float   v5 = 6;
        final double  v6 = 8.8;
        final char    v7 = 68;
        
        //v1 = 0;   // it will not compile becouse assigning new value to a constant is prohibited!
    }
    
    public static void printF(Task2 t){
        for(Field f : t.getClass().getDeclaredFields()){
            System.out.print(f.getName()+"  ");
            
            switch (f.getType().toString()){
                case "byte":
                    System.out.println(t.v1);
                    break;
                case "short":
                    System.out.println(t.v2);
                    break;
                case "int":
                    System.out.println(t.v3);
                    break;
                case "long":
                    System.out.println(t.v4);
                    break;
                case "float":
                    System.out.println(t.v5);
                    break;
                case "double":
                    System.out.println(t.v6);
                    break;
                case "char":
                    System.out.println(t.v7+0);
                    break;
            }
        }
        System.out.println("-------------------------------");
    }

}