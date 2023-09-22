import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<User> list = new LinkedList<>();
        User user = new User(10,"Rajesh");
        User user1 = new User(20,"Shyam");
        list.add(user);
        list.add(user1);
        for(User u:list){
            System.out.println("User Id: "+u.getId() + " Name: "+u.getName());
        }
        System.out.println(list.get(1).getName());
    }
}
