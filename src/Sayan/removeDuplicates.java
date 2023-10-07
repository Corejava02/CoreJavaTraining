package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicates 
{
    public static void main(String[] args) 
    {
        List<Integer> num = new ArrayList<>();  
        num.add(25);  
        num.add(10);  
        num.add(39);  
        num.add(55);  
        num.add(25);
        num.add(29);
        num.add(39);
        System.out.println("The List = "+num);  
        
        System.out.println("After removind Duplicates, The List = " + duplicates(num));
    }

    public static List<Integer> duplicates(List<Integer> num) 
    {
        Set<Integer> set = new HashSet<>(num);
        return new ArrayList<>(set);
    }
}
