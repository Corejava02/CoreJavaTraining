public class CountOccurences {
    public static void main(String[] args) {
        String input = "anikpaul";
        char a = 'a';
        int count=0;

        for(int i=0;i<input.length();i++){ //0,1,2,3,4,5,6
            char b=input.charAt(i); // b='a' 'n' 'i' 'k' 'p' 'a' 'u'
            if(a==b){
                count++; // 1, 2
            }
        }
        System.out.println(count);
    }
}
