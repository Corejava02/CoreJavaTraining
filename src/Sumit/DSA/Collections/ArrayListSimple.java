package Sumit.DSA.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ArrayListSimple
 */
public class ArrayListSimple {
    List<Integer>list=new ArrayList<>();
    int add() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int ele = s.nextInt();
        return ele;
    }
    void SumofAll()
    {
        int sum=0;
        for(Integer val:list){
            sum=sum+val;
        }
        System.out.println("The Summation of all elements: "+sum);
    }
    void MulOfAll()
    {
        int pro=1;
        for(Integer val:list){
            pro=pro+val;
        }
        System.out.println("The product of all elements: "+pro);

    }
    void count()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose occurences is to be counted:");
        int num=sc.nextInt();
        int c=0;
        if(list.contains(num))
        {
            for(Integer item:list)
            {
                if(item==num)
                {
                    c=c+1;
                }
            }
            System.out.println("The no.of occurence of "+num+" is "+c);
        }
        else{
            System.out.println("Item not present.");
        }
    }
    void StringList()
    {
         List<String> stringList = new ArrayList<>();
         for (Integer item :list) {
            stringList.add(Integer.toString(item));
        }
        System.out.println(stringList);
    }
    void displayList() {
        System.out.println("The list:");
        for (Integer j : list) {
            System.out.println(j);}
        
    }
    public static void main(String[] args) {
      ArrayListSimple ob = new ArrayListSimple();
        Scanner obj = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            System.out.println("Enter 1 to add number, 2 to find sum, 3 to find product,4 to count the no of occurence of a number in the list, 5 to convert to stringlist ,6 to display list and 7 to exit...");
            int ch = obj.nextInt();
            switch (ch) {
                case 1:
                    ob.list.add(ob.add());
                    break;
                case 2:
                ob.SumofAll();
                    break;
                case 3:
                ob.MulOfAll();
                break;
                case 4:
                ob.count();
                break;
                case 5:
                ob.StringList();
                break;
                case 6:
                if(ob.list.isEmpty())
                {
                    System.out.println("List is Empty.");
                }
                else{
                     ob.displayList();
                }
                    break;
                default:
                    i = 1;
            }
        }
      
    }

   
}
