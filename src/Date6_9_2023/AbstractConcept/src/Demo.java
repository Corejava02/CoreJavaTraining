abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("play Music");
    }
}

class Supra extends Car{
    public void fly(){
        System.out.println("Fly - Supra");
    }

    public void drive(){
        System.out.println("Drive");
    }
}

class UpdatedSupra extends Supra{
    public void fly(){
        System.out.println("Fly");
    }
}

public class Demo {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.playMusic();

        Car car1 = new Supra();
        car1.drive();
        car1.playMusic();
        car1.fly();
    }
}
