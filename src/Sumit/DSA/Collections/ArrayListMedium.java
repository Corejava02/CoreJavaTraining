package Sumit.DSA.Collections;
import java.util.*;
public class ArrayListMedium {
    List<Double>list1=new ArrayList<>(); 
    List<Integer>list2=new ArrayList<>();
    double add1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the double values:");
        double ele = s.nextDouble();
        return ele;
    }
    int add2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integers:");
        int ele = s.nextInt();
        return ele;
    }
    void findMax()
    {
        double max=0.0;
        for(Double i:list1){
            if(max<i)
            {
                max=i;
            }
        }
        System.out.println("The maximum value in the list of doubles:"+max);

    }
    void findMin(){
    int min=0;
        for(Integer i:list2){
            if(min>i)
            {
                min=i;
            }
        }
        System.out.println("The minimum value in the list of integers:"+min);
    }
    void displayList1() {
        System.out.println("The list:");
        for (Double j : list1) {
            System.out.println(j);}
        
    }
    void displayList2() {
        System.out.println("The list:");
        for (Integer j : list2) {
            System.out.println(j);}
        
    }
    public static void main(String[] args) {
        ArrayListMedium ob = new ArrayListMedium();
        Scanner obj = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            System.out.println("Enter 1 to add number in the double list, 2 to add number in integer list, 3 to find max value in double list,4 to find minimum value in the integer list, 5 to  display list of doubles and 6 to display list of integers and 7 to exit...");
            int ch = obj.nextInt();
            switch (ch) {
                case 1:
                    ob.list1.add(ob.add1());
                    break;
                case 2:
                ob.list2.add(ob.add2());
                    break;
                case 3:
                ob.findMax();
                break;
                case 4:
                ob.findMin();
                break;
                case 5:
                if(ob.list1.isEmpty())
                {
                    System.out.println("List1 is Empty.");
                }
                else{
                     ob.displayList1();
                }
                    break;
            case 6:
            if(ob.list2.isEmpty())
                {
                    System.out.println("List2 is Empty.");
                }
                else{
                     ob.displayList2();
                }
                    break;
                default:
                    i = 1;
            }
        }
    }
}
