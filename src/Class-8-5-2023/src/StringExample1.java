//Immutable
//Mutable -> StringBuilder and StringBuffer

public class StringExample1 {
    public static void main(String[] args) {
        String abc= "Rajesh";
        abc = "Rajesh Jha";

        String s1 = "Abc";
        String s2 = "abc";
        String s3 = "Abc";

//        System.out.println(s1==s3);

//        System.out.println(abc.charAt(1));
//        System.out.println(abc.length());

//        for(int i=0;i<abc.length();i++){
//            System.out.println(abc.charAt(i));
//        }

        System.out.println(abc.toLowerCase());
        System.out.println(s1.equals(s2));
        System.out.println(s1.concat("bca"));
        System.out.println(s1+"bca");
    }
}
