class SunnyNumberEX1 {
    public static void main(String []arg){
        int a=4;
        boolean result = isSunny(a);
        System.out.println(result);
    }

    public static boolean isSunny(int val){
        double sqrt = Math.sqrt(val);
        if((int)sqrt<sqrt){
            return false;
        }
        return true;
    }
}