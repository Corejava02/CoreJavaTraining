public class characterSearch {
    public static void main(String args[]) 
  {
      
  String txt = "Sayan Mondal";
  char src = 'a';
  int c=0;

  for(int i=0; i<txt.length(); i++)
  {
      if(txt.charAt(i) == src)
      {
        c++;
      }
  }
  
  System.out.println("The character 'a' in this String is = "+c+" times.");
  }
}
