public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rajesh");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Jha");
        System.out.println(sb);
//        sb.deleteCharAt(3);
//        System.out.println(sb);
//        sb.delete(0,6);
//        System.out.println(sb);
//        sb.insert(0,"Java ");
//        System.out.println(sb);
        System.out.println(sb.length());
        sb.setLength(30);
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.substring(0,2));
        StringBuffer sb1 = new StringBuffer();
    }
}
