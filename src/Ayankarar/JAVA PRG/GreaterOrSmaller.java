public class GreaterOrSmaller {
    public static void main(String []args){
        int a=10;
        int b=30;
        int c=70;
        if(a>b && a>c){
            System.out.println("a is greater than b and c");
        }
        else if(b>c && b>a){
            System.out.println("b is greater than c & a ");
        }
        else if(c>a && c>b){
            System.out.println("c is greater than a and b");
        }

    }
}
