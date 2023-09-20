import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Rajesh",30);
        map.put("Shyam",32);
        map.put("Rajesh",35);
        map.put("Sushil",67);
        map.put("Karan",43);
        map.put("Harsh",43);
//        System.out.println(map.keySet());
//        System.out.println(map.get("Sushil"));

        for(String key:map.keySet()){
            System.out.println(key +" : "+ map.get(key));
        }

//        Set set = map.entrySet();
//        Iterator i = set.iterator();
//        while (i.hasNext()){
//            Map.Entry entry = (Map.Entry)i.next();
//            System.out.println(entry.getKey() + " : "+entry.getValue());
//        }

//        map.entrySet().stream().forEach(System.out::println);
    }


}
