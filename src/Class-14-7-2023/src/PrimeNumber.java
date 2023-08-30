public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = isPrimeNumber(7);
        System.out.println(isPrime);
    }

    public static boolean isPrimeNumber(int num) {
        System.out.println(Math.sqrt(num));
        if (num <= 1) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
