public class ClassAndObject {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.call();
        mobile.colour = "Blue";
        System.out.println(mobile.colour);
        int a = mobile.getLength();
        System.out.println(mobile.getLength());
        System.out.println(a);
    }
}

class Mobile {
    String colour = "Red";
    int height = 10;

    public void call() {
        System.out.println("Calling");
    }

    public int getLength() {
        return 10;
    }

}
