package Sumit.DSA.Collections;

import java.util.ArrayList;

public class FloatListAverage {
    public static void main(String[] args) {
        ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(6.5f);
        floatList.add(7.4f);
        floatList.add(3.5f);
        floatList.add(2.5f);
        float sum = 0.0f;
        int count = floatList.size();
        for (Float number : floatList) {
            sum += number;
        }
        float average = sum / count;
        System.out.println("Average: " + average);
    }
}

   

