package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class simpleProblems {
    public static void main(String[] args) {
        //Sum all the elements in an ArrayList of integers.
        ArrayList<Integer> num1 = new ArrayList<>();

        num1.add(10);
        num1.add(15);
        num1.add(25);
        num1.add(10);
        num1.add(35);
        num1.add(10);

        int sum = 0;
        for(int temp : num1)
        {
            sum += temp;
        }
        System.out.println("The Sum of The Elements in The Arraylist = "+sum);

        //Count the occurrences of a specific element in an ArrayList.
        int x = Collections.frequency(num1, 10);
        System.out.println("The Number of occurences of The Element 10 in The Arraylist = "+x);

        //Multiply all elements in an ArrayList of doubles.
        ArrayList<Double> num2 = new ArrayList<>();

        num2.add(10.2);
        num2.add(9.4);
        num2.add(5.9);
        num2.add(2.5);
        num2.add(7.3);

        double mul = 1;
        for(Double temp : num2)
        {
            mul += temp;
        }
        System.out.println("The Sum of The Elements in The Arraylist = "+mul);

        //Find the average of elements in an ArrayList of floats.
        ArrayList<Float> num3 = new ArrayList<>();

        num3.add((float) 10.265);
        num3.add((float) 9.45);
        num3.add((float) 5.961);
        num3.add((float) 52.123);
        num3.add((float) 72.15);

        Float add = (float) 0;
        for(Float temp : num3)
        {
            add += temp;
        }

        Float avg = (add / 5);
        System.out.println("The Sum of The Elements in The Arraylist = "+avg);
    }
}
