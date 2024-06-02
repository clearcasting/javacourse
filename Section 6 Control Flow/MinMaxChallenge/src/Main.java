import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printMinMax();
    }

    public static void printMinMax() {
        Scanner scanner = new Scanner(System.in);
        double min = 0.0;
        double max = 0.0;
        int counter = 0;
        boolean shouldContinue = true;

        System.out.println("Please enter a number. You may also enter any letter to quit.");

        do {
            try {
                double number = Double.parseDouble(scanner.nextLine());
                if (number > max || counter == 0){
                    max = number;
                }

                if (number < min || counter == 0) {
                    min = number;
                }

                System.out.println("Your lowest number entered is: " + min);
                System.out.println("Your highest number entered is: " + max);
                counter++;
            } catch (NumberFormatException nfe) {
                shouldContinue = false;
            }
        } while (shouldContinue);

        System.out.println("Exiting program, thank you for using MinMax!");
    }
}
