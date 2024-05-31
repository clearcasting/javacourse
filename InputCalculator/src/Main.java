import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        boolean shouldContinue = true;

        System.out.println("Enter as many whole numbers as you want and I will calculate the sum and average of them.");
        System.out.println("To exit the program simply enter anything that isn't a whole number.");

        while (shouldContinue) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                counter++;
            } catch (NumberFormatException nfe) {
                shouldContinue = false;
                long average = Math.round((double) sum / counter);
                System.out.println("SUM = " + sum + " AVG = " + average);
            }
        }
    }
}
