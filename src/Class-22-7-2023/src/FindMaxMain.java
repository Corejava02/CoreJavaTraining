public class FindMaxMain {
    public static void main(String[] args) {
        FindMax findMax =new FindMax();
        System.out.println(findMax.getMax(20,30));
        System.out.println(findMax.getMax(20.5,30.5));
    }
}

class FindMax
{
    public int getMax(int a, int b){
        return Math.max(a,b);
    }

    public double getMax(double a, double b){
        return Math.max(a,b);
    }
}
