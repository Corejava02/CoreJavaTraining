
class A
{
    public A(){
        super();
        System.out.println("Inside A");
    }

    public A(int a, int b){
        System.out.println(a);
    }
}

class B extends A
{
    public B(){
        System.out.println("Inside B");
    }

    public B(int a, int b){
        System.out.println(a+"   "+b);
    }

    public B(int a){
        this();
        System.out.println("Inside Para Cons B" + a);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
