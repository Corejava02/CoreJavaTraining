import tools.*;

import java.util.*;

public class PackageEx1 {
    public static void main(String[] args) {
        PackageEx2 obj1 = new PackageEx2();
        obj1.show();
        Calc1 calc1 = new Calc1();
        calc1.add(1,2);
        Calc2 calc2 = new Calc2();
        calc2.sub(2,1);

        System.out.println("Hii");

        ArrayList<Integer> arrayList = new ArrayList<>();
    }
}
