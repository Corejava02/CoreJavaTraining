public class countCharTwoStrings {
    public static void main(String[] args) {
        String txt1 = "Sayan Mondal";
        String txt2 = "I live in Madhyamgram";
        int c1=0, c2=0;    

        for(int i=0; i<txt1.length(); i++) 
        {    
            if(txt1.charAt(i) != ' ')  
            {  
                c1++;    
            }
        }   
        
        for(int i=0; i<txt2.length(); i++) 
        {    
            if(txt2.charAt(i) != ' ')  
            {  
                c2++;    
            }
        } 

        int total = c1+c2;
        System.out.println("Total Number of Characters in This String = "+total); 
    }
}
