public class Main {
    public static void main(String[] args) {

        int total = 0;
        for (int wholeNumber = 10; total < 3 && wholeNumber <= 1000; wholeNumber++) {
            if (isPrime(wholeNumber)) {
                System.out.println(wholeNumber + " is a prime number.");
                total++;
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
