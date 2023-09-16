package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class mediumLevel {
    public static void main(String[] args) {
        //Find the maximum value in an ArrayList of doubles.
        ArrayList<Double> num1 = new ArrayList<>();

        num1.add(10.2);
        num1.add(9.4);
        num1.add(15.9);
        num1.add(22.5);
        num1.add(17.3);

        Double high = Collections.max(num1); 
        System.out.println("The Maximum Value of The Arraylist = "+high);

        //Find the minimum value in an ArrayList of integers.
        ArrayList<Integer> num2 = new ArrayList<>();

        num2.add(42);
        num2.add(40);
        num2.add(25);
        num2.add(37);
        num2.add(59);

        Integer low = Collections.min(num2); 
        System.out.println("The Minimum Value of The Arraylist = "+low);

    }
}
