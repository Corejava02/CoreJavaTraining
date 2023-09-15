package Sumit.DSA.Collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ArrayListSimple
 */
public class ArrayListSimple {
    ArrayList<Integer>list=new ArrayList<>();
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
        if(list.contains(num)
        {
            
        }
    }
    void displayList() {
        System.out.println("The list:");
        for (Integer j : list) {
            System.out.println(j);}
        ArrayList<Integer> shallowcopy=new ArrayList<>(list);
        System.out.println("The shallowcopy:");
        for (Integer j1 : shallowcopy) {
            System.out.println(j1);
        }
    }
    public static void main(String[] args) {
      ArrayListSimple ob = new ArrayListSimple();
        Scanner obj = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            System.out.println("Enter 1 to add number, 2 to remove number, 3 to display list,4 to clear all numbers in the list, 5 to convert list to array and 8 to exit...");
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
                
                break;
                case 5:
                
                break;
                case 6:
                case 7:
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
