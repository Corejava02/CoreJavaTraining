package Collection;

import java.util.ArrayList;

public class basicOperations {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("The Arraylist = "+num);

        //check if the arraylist is empty
        if(num.isEmpty())
        {
            System.out.println("The ArrayList is Empty.");
        }
        else
        {
            System.out.println("The ArrayList is not Empty.");
        }

        num.add(10);
        num.add(15);
        num.add(25);
        num.add(50);
        num.add(35);
        num.add(40);
        //add elements
        System.out.println("The Arraylist = "+num);

        //remove element at a specific index
        System.out.println("The Arraylist = "+num.remove(3));

        //check if the arraylist is empty
        if(num.isEmpty())
        {
            System.out.println("The ArrayList is Empty.");
        }
        else
        {
            System.out.println("The ArrayList is not Empty.");
        }

        //find the index of the specific element
        System.out.println("The Index of The Element 25 in The Arraylist = "+num.indexOf(25));

        //clone the arraylist
        ArrayList<Integer> temp = (ArrayList<Integer>) num.clone();
        System.out.println("The Clone Arraylist = "+temp);

        //clear the arraylist
        num.clear();
        System.out.println("The Arraylist = "+num);
    }
}
