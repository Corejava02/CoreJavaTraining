class Mobile{
    String brand;
    int price;
    String model;
    String imei;
//    String type;

    static String type="smart phone";

    public void show(){
        System.out.println(brand+" : "+price+" : "+type);
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand="Apple";
        m.price=1000;
        m.model="i10";
        m.imei="1233";
//        m.type="smart phone";

        Mobile m1 = new Mobile();
        m1.brand="Android";
        m1.price=1000;
        m1.model="Redmi note 10";
        m1.imei="12334";
//        m1.type="smart phone";
//        Mobile.type="smart phone";
        m.show();
        m1.show();
    }
}
