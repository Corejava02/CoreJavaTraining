public class countCharacters
{
    public static void main(String[] args) {
        String txt = "Sayan Mondal";
        int c = 0;    

        for(int i=0; i<txt.length(); i++) 
        {    
            if(txt.charAt(i) != ' ')  
            {  
                c++;    
            }
        }     
        System.out.println("Total Number of Characters in This String = "+c);  
    }
}