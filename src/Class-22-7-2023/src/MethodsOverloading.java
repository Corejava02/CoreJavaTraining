public class MethodsOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1.5f,2.5f));
        System.out.println(calculator.add(1,2, 3));
    }
}

class Calculator
{
    public int add(int a, int b){
        return a+b;
    }

    public float add(float a, float b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}
