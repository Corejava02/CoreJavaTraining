package protectedpack;

import others.B;

public class ProtEx1 {
    protected int age=10;

    protected void show(){
        System.out.println(age);
        B obj1 = new B();
        obj1.c=30;
    }
}
