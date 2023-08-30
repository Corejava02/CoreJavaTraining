import others.B;
import protectedpack.ProtEx2;

public class AccessModEx {
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.a);
        obj1.show();

        B obj2 = new B();
//        System.out.println(obj2.b);

        ProtEx2 obj3 = new ProtEx2();
//        System.out.println(obj3.age);
    }
}
