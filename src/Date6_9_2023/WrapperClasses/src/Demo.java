public class Demo {
    public static void main(String[] args) {
        int a=10;
//        Integer a1 = new Integer(a); //boxing

        Integer a1 = a; // autoboxing

        int num = a1; // unboxing

        System.out.println(a1);
        System.out.println(num);

        double b = 12.5;
        Double b1 = 12.5;
    }
}
