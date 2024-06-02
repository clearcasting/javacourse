public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
//        → should return true since the digit 2 appears in both numbers

        System.out.println(hasSharedDigit(9, 99));
//        → should return false since 9 is not within the range of 10-99

        System.out.println(hasSharedDigit(15, 55));
//        → should return true since the digit 5 appears in both numbers
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int aFirstDigit = a / 10;
        int aLastDigit = a % 10;

        int bFirstDigit = b / 10;
        int bLastDigit = b % 10;

        if (aFirstDigit == bFirstDigit || aFirstDigit == bLastDigit) {
            return true;
        } else return aLastDigit == bFirstDigit || aLastDigit == bLastDigit;
    }
}
