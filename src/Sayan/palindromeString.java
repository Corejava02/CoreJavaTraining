public class palindromeString {
    public static void main(String[]args)
    {
        String txt="madam", rev="";
        
        for(int i=0; i<txt.length(); i++)
        {
            rev = txt.charAt(i) + rev;
        }

        if (rev.equals(txt))
        {
            System.out.println("This String is a Palindrome String.");
        }
        else
        {
            System.out.println("This String is not a Palindrome String.");
        }
    }
}
