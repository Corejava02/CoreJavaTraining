import java.util.Arrays;

enum Status{
    Running, Failed, Pending, Success, InProgress
}

public class Demo {
    public static void main(String[] args) {
        Status s1 = Status.Pending;
        Status a = Status.InProgress;
//        System.out.println(a.ordinal());
//
//        Status[] s = Status.values();
//        for(Status i:s){
//            System.out.println(i);
//        }
//        if(s1 ==Status.Success){
//            System.out.println("success");
//        } else if (s1==Status.Pending) {
//            System.out.println("Pending");
//        }

        switch (s1){
            case Running:
                System.out.println("Running");
                break;
            case Pending:
                System.out.println("Pending");
                break;
        }
    }
}
