public class replaceSpaceChar {
    public static void main(String[] args) {
        String txt = "Once in a blue moon";    
        char ch = '_';    
            
        txt = txt.replace(' ', ch);    
            
        System.out.println("After replacing Spaces, The New String is = "+txt);    
    }
}
