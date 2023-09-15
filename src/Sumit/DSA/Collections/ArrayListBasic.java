
package Sumit.DSA.Collections;

import java.util.*;

public class ArrayListBasic {
    ArrayList<Integer> list = new ArrayList<>();
    

    int add() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int ele = s.nextInt();
        return ele;
    }

    int del() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer to be deleted:");
        int ele = sc.nextInt();
        return ele;
    }
    void clear()
    {
        list.clear();
    }
    void Arrayto()
    {
        Object a[]=list.toArray();
        for(Object item:a)
        {
            System.out.println(item);
        }
    }
    void displayList() {
        System.out.println("The list:");
        for (Integer j : list) {
            System.out.println(j);}
        ArrayList<Integer> shallowcopy=new ArrayList<>(list);//or we can use list.clone()
        System.out.println("The shallowcopy:");
        for (Integer j1 : shallowcopy) {
            System.out.println(j1);
        }
    }

    public static void main(String[] args) {
        ArrayListBasic ob = new ArrayListBasic();
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
                int pos=ob.list.lastIndexOf(ob.del());
                ob.list.remove(pos);
                    break;
                case 3:
                if(ob.list.isEmpty())
                {
                    System.out.println("List is Empty.");
                }
                else{
                     ob.displayList();
                }
                    break;
                case 4:
                ob.clear();
                break;
                case 5:
                ob.Arrayto();
                break;
                default:
                    i = 1;
            }
        }
    }
}

