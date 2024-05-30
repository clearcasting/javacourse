public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
//        → should return true

        System.out.println(isPalindrome(707));
//        → should return true

        System.out.println(isPalindrome(11212));
//        → should return false because reverse is 21211 and that is not equal to 11212.
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int i = number;

        
        while (i != 0) {
            lastDigit = i % 10;
            reverse = reverse * 10 + lastDigit;

            i = i / 10;
        }
        return reverse == number;

    }
}
