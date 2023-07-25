package Subham;
public class CopyElements {
     public static void main (String[]args) {
        int a[]={1,2,4};
        int b[] = new int[a.length];
        b=a;
        b[0]++;

        System.out.println ("Numbers of a[]");
        for (int i=0; i<a.length; i++)
        System.out.print(a[i]+ " ");

        System.out.println("Number of b[]");
        for (int i=0; i<b.length; i++)
        System.out.print(b[i]+ " ");
     }
     
}
