package List;

import java.util.ArrayList;
import java.util.Collections;

public class reverseList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer>  num = new ArrayList<>();  
        num.add(10);  
        num.add(55);  
        num.add(34);  
        num.add(29);  
        System.out.println("The Original List = " + num);        
        Collections.reverse(num);  
        System.out.println("the Reverse List = " + num);  
    }
}
