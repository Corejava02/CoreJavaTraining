package Sumit.DSA.Collections;
import java.util.*;

public class ReverseList {
    List<Integer> myList = new ArrayList<>();
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
    void rev()
    {
        Collections.reverse(myList);
        System.out.println(myList);
    }
    public static void main(String[] args) {
       ReverseList ob = new ReverseList();
        Scanner obj = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            System.out.println("Enter 1 to add number, 2 to remove number, 3 to reverse list,4 to exit...");
            int ch = obj.nextInt();
            switch (ch) {
                case 1:
                    ob.myList.add(ob.add());
                    break;
                case 2:
                int pos=ob.myList.lastIndexOf(ob.del());
                ob.myList.remove(pos);
                    break;
                case 3:
                if(ob.myList.isEmpty())
                {
                    System.out.println("List is Empty.");
                }
                else{
                     ob.rev();
                }
                    break;
                default:
                    i = 1;
            }
        }  
        
    }
}



   

   
