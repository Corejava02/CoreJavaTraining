public class countPunctuation {
    public static void main(String[] args) { 
        String txt = "Hello Sir! My name is Sayan Mondal. I live in Madhyamgram.";  
        int c=0; 

        for (int i=0; i<txt.length(); i++) 
        {  
            if(txt.charAt(i) == '!' || txt.charAt(i) == ',' || txt.charAt(i) == ';' || txt.charAt(i) == '.' || txt.charAt(i) == '?' || txt.charAt(i) == '-' || txt.charAt(i) == '\'' || txt.charAt(i) == '\"' || txt.charAt(i) == ':') 
            {  
                c++;  
            }  
        }  
        System.out.println("Total Number of Punctuation Characters in The Given String = "+c);  
    }
}
