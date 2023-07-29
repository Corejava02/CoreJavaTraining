/*
    arr[] = {1,2,3,4,5,6}
    output 6,1,2,3,4,5
    pos=2
    output 3,4,5,6,1,2
 */
public class LeftRotation {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        //shift
        int target;
        target=4;


        int index=0;
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]==target){
                index=i;
            }
        }
        //System.out.println(index);

        int shift;
        shift=arr[0];
        arr[0]=arr[index];
        arr[index]=shift;

        //sorting
        for (int i=1 ; i<(arr.length -1); i++){
            for(int j=1; j<(arr.length-i) ;j++){
                if (arr[j] > arr[j+1]){
                    int swap;
                    swap=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        for (int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
