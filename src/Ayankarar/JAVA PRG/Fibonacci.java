public class Fibonacci {
    public static void main(String []arg){
        int a=0;
        int b=1;
        int c=a+b;
        System.out.println(+a);
        System.out.println(+b);
        System.out.println(+c);

        while (c<=11){
            a=b;
            b=c;
            c=a+b;
            c++;
            System.out.println(c);
        }

    }
}
