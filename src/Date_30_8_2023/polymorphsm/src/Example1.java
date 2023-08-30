class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("in C show");
    }
}

public class Example1 {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.show();

        A obj2 = new A();
        obj2.show();

        obj2 = new C();
        obj2.show();
    }
}
