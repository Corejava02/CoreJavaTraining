public class StringToCharArray {
    public static void main(String[] args) {
        String a = "Hello World!";
//        for(int i=a.length()-1;i>=0;i--){
//            System.out.print(a.charAt(i));
//        }
        char[] b = a.toCharArray();
        for(char c:b){
            System.out.print(c);
        }
    }
}
