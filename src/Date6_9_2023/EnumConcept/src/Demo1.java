enum Laptop{
    Macbook(2000),Thinkpad(1800);
    private int price;
    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
//        System.out.println(lap.getPrice());

        for(Laptop lp:Laptop.values()){
            System.out.println(lp.getPrice());
        }
    }
}
