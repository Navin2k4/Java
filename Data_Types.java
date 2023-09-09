import java.awt.*;

public class Data_Types {
    public static void main(String[] args) {

        //Primitive data Types
        //byte[-128 to 127] , short[-32k to 32k] , long[-2B to 2B] , int[-20B to 20B] , boolean , char - 2 byte
        //long num= 10000000000L; // L stores a long
        //float num = 96.5F; F stores as float
        int a = 10;
        int b = a;
        a = 5;
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        //Reference Data Types
        Point p1 = new Point(5,7);
        Point p2 = p1;
        System.out.println("p2 : " + p2);
        p1.x=7; //changing point 1 x also changes point 2 x it is reference datatype
        System.out.println("p1 : " + p1);
        System.out.println("p2 : " + p2);






    }
}
