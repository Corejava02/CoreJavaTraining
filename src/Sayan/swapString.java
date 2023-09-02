public class swapString {
    public static void main(String[] args) {
        String txt1 = "Sayan";
        String txt2 = "Mondal";
         
        System.out.println("Before Swapping, txt1 = "+txt1+" and txt2 = "+txt2);

        txt1 = txt1 + txt2;
        txt2 = txt1.substring(0,txt1.length()-txt2.length());
        txt1 = txt1.substring(txt2.length());
    
        System.out.println("After Swapping, txt1 = "+txt1+" and txt2 = "+txt2);       
    }
}
