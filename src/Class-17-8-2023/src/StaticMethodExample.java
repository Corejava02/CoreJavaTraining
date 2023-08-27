class Mobile1{
    String brand;
    int price;
    String model;
    String imei;
//    String type;

    static String type="smart phone";

//    public void show(){
//        System.out.println(brand+" : "+price+" : "+type);
//    }

    public static void show1(Mobile1 m){
        System.out.println(m.brand+" : "+m.price+" : "+type);
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        Mobile1 m = new Mobile1();
        m.brand="Apple";
        m.price=1000;
        m.model="i10";
        m.imei="1233";
//        m.type="smart phone";

        Mobile1 m1 = new Mobile1();
        m1.brand="Android";
        m1.price=1000;
        m1.model="Redmi note 10";
        m1.imei="12334";
//        m1.type="smart phone";
//        Mobile.type="smart phone";
        Mobile1.show1(m);
//        m1.show();
    }
}
