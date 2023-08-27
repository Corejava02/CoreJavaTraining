/**
 * convert one data type to another
 * Implicit type casting
 */
public class TypeCasting {
    public static void main(String[] args) {

     //Imlicit   
     byte b = 127;
     int a = b;
     float f = 5.9F;

     //explicit   
     int t = (int)f;
     int b1 = 1270;
     byte b3 = (byte)b1;   

     System.out.println(a);
     System.out.println(b);
     System.out.println(t);
     System.out.println(b3);
    }
}
