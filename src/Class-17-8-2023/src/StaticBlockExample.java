class Mobile2 {
    String brand;
    int price;
    static String type;

    static {
        type = "smart phone";
        System.out.println("inside static");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : "+type);
    }
}

public class StaticBlockExample {
    public static void main(String[] args) throws ClassNotFoundException {
//        Mobile2 m2 = new Mobile2();
//        m2.brand = "Oppo";
//        m2.price=1000;
//        m2.show();
        Class.forName("Mobile2");

    }
}
