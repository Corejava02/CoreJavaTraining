import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
//        Object[] arr=list.toArray();
//        for(Object obj:arr){
//            System.out.println(obj);
//        }
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);

        System.out.println(Arrays.toString(arr));


    }

}
