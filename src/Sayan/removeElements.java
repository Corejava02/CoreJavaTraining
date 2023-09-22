package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class removeElements 
{
    public static void removeElementsDivide(List<Integer> list, int div) 
    {
        List<Integer> elementsRemove = new ArrayList<>();

        for (int element : list) 
        {
            if (element % div == 0) 
            {
                elementsRemove.add(element);
            }
        }
        list.removeAll(elementsRemove);
    }

    public static void main(String[] args) 
    {
        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(25);
        num.add(13);
        num.add(42);
        num.add(15);
        num.add(29);
        System.out.println("The List = " + num);
        
        int div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number by which The List is divided = ");
        div = sc.nextInt();

        removeElementsDivide(num, div);
        System.out.println("List after removing elements divisible by " + div + ": " + num);
    }
}
