public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
//        → should return true since 1 is the rightmost digit in numbers 41 and 71

        System.out.println(hasSameLastDigit (23, 32, 42));
//        → should return true since 2 is the rightmost digit in numbers 32 and 42

        System.out.println(hasSameLastDigit (9, 99, 999));
//        → should return false since 9 is not within the range of 10-1000
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int aLastDigit = a % 10;
        int bLastDigit = b % 10;
        int cLastDigit = c % 10;
        return aLastDigit == bLastDigit || aLastDigit == cLastDigit || bLastDigit == cLastDigit;
    }

    public static boolean isValid(int a) {
        return a <= 1000 && a >= 10;
    }
}
