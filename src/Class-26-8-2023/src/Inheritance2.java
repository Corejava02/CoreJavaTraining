// is, has
// parent class, child class
// base class, derived class
// super class, sub class

class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvCalc extends Calc{
    public int div(int a, int b){
        return a/b;
    }
    public int mul(int a, int b){
        return a*b;
    }
}

class VeryAdvCalc extends AdvCalc{
    public int mod(int a, int b){
        return a%b;
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        AdvCalc advCalc = new AdvCalc();
        advCalc.add(12,10);
        advCalc.div(12,10);

        Calc calc = new Calc();
        calc.add(10,12);

        VeryAdvCalc veryAdvCalc = new VeryAdvCalc();
        veryAdvCalc.add(10,12);
        veryAdvCalc.div(23,24);
        veryAdvCalc.sqrt(10.5D);
    }
}
