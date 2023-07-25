package Subham;
public class MaxFinder {
    {
        Findmax findmax=new Findmax(); 
        System.out.println(findmax.getmax(20,30));
        System.out.println(findmax.getmax(20.5,30.4));

    }
    public static int getmax(int a, int b) {
        return Math.max(a,b);
    }
    public static double getmax(double a, double b) {
        return Math.max(a,b);
    }
    public static int getmax(int[]arr) {
        if (arr==null || arr.length==0) {
            return Math.max("Array can not be null or empty.");
        }
        int max=numbers[0];
        for(int i = 1; i<numbers.length;i++) {
            if(numbers[i]>max) {
                max=numbers[i];
            }
        }
        return max;
    }
    public static void main(String[]args) {
        int maxInt=getMax(10,30);
        double maxDouble=getMax(21.3,45.1);
        int[]array={5,2,9,1,7};
        int maxarray=getMax(array);

        System.out.println("Max integer:" +maxInt);
        System.out.println("Max double:" +maxDouble);
        System.out.println("Max array value:" +maxArray);
    }
}
