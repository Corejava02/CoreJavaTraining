public class countVowelConsonent {
    public static void main(String[] args) {
        int vc = 0, cc = 0;    
        String txt = "I am Sayan Mondal";      
            
        for(int i = 0; i < txt.length(); i++) {      
            if(txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o' || txt.charAt(i) == 'u' || txt.charAt(i) == 'A' || txt.charAt(i) == 'E' || txt.charAt(i) == 'I' || txt.charAt(i) == 'O' || txt.charAt(i) == 'U') 
            {     
                vc++;    
            }    
            else 
            {          
                if(txt.charAt(i) != ' ')  
                {  
                    cc++;    
                }   
            }    
        }    
        System.out.println("Number of Vowels in This String = " + vc);    
        System.out.println("Number of Consonants in This String = " + cc);    
    }
}
