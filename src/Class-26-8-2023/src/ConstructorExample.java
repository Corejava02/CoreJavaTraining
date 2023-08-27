class Human
{
    private int age;
    private String name;

    private float height;

//    public Human(){
//        age=10;
//        name = "Rajesh";
//        System.out.println("inside default constructor");
//    }

    public Human(){
        super();
    }

    public Human(int age, String name){
        this.age=age;
        this.name = name;
        System.out.println("inside parameterized constructor");
    }

    public Human(int a, String b, float c){
        age=a;
        name = b;
        height=c;
    }


    public void display(){
        System.out.println("Age: "+age+ "  Name:"+name+ "  Height: "+height);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Human human = new Human();
        Human human1 = new Human(12,"Anik", 5.5F);
        Human human2 = new Human(10,"Sumit");
        Human human3 = new Human(8,"Sayan");

        human.display();
        human1.display();
        human2.display();
        human3.display();
    }
}
