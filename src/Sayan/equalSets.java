package Set;

import java.util.HashSet;
import java.util.Set;

public class equalSets 
{
    public static void main(String[] args) 
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(15);
        set1.add(20);
        set1.add(13);
        set1.add(10);
        set1.add(31);
        System.out.println("Set1 = " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(15);
        set2.add(31);
        set2.add(20);
        set2.add(10);
        set2.add(13);
        System.out.println("Set2 = " + set2);

        boolean result = set1.equals(set2);  
        if(result) 
        {  
            System.out.println("This Two Sets 'Set1' and 'Set2' are equal.");  
        }
        else 
        {  
            System.out.println("This Two Sets 'Set1' and 'Set2' are not equal."); 
        }
    }
}
