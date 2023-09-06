abstract class C{
//    public void show(){
//        System.out.println("In show");
//    }

    public abstract void show();
}

public class InnerClass {
    public static void main(String[] args) {
        C obj = new C(){
            public void show(){ // Anonymous Inner Class
                System.out.println("In new show");
            }
        };
        obj.show();

//        C obj1 = new C();
//        obj1.show();
    }
}
