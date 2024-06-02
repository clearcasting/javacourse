public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
//        → should return 20 since 2 + 4 + 6 + 8 = 20

        System.out.println(getEvenDigitSum(252));
//        → should return 4 since 2 + 2 = 4

        System.out.println(getEvenDigitSum(-22));
//        → should return -1 since the number is negative

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number >= 2) {
            if (number % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }

        return sum;
    }
}
