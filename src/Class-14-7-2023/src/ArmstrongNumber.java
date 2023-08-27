
/*
    123456778 -> 1*1*1 + 2*2*2 + 3*3*3
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(371));
    }

    public static boolean isArmstrong(int num) { // num = 123
        int temp = num; // 123
        int sum = 0; // 0
        int noOfDigits = getDigit(num); // 3

        while (num > 0) { // true(123>0), true(12>0), true(1>0)
            int d = num % 10; // 123%10 = 3, 12%10 = 2, 1%10 = 1
            sum += Math.pow(d, noOfDigits); // Math.pow(3,3) = 27, Math.pow(2,2), Math.pow(1,1)
            num = num / 10; // 12, 1, 0
            System.out.println(d);
            System.out.println(sum);
        }
        return sum == temp ? true : false;
    }

    public static int getDigit(int num) {
        int count = 0; // 0, 1, 2
        while (num != 0) {  // true
            num = num / 10; // 12, 1, 0
            count++; // 1, 2, 3
        }
        return count;
    }
}
