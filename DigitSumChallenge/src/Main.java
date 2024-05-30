public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        if(number < 10) {
            return number;
        }
        while (number > 0) {
            //n % 10
            //n = n / 10
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
