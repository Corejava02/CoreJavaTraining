interface A1{
    void show();
    void config();

    int a=10;
}

interface A2{
    void play();
}

class A implements A1,A2{
    public void show(){
        System.out.println("in A-show");
    }

    public void config() {
        System.out.println("in config-show");
    }

    public void play() {
        System.out.println("Play");
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) {
        A1 obj1 = new A();
        A2 obj2 = new A();

        obj1.config();
        obj1.show();
        System.out.println(A1.a);

        obj2.play();
    }
}
