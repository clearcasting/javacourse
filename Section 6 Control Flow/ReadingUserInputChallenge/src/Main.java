import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printInputSum();
    }

    public static void printInputSum() {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;

        do {
            try {
                System.out.println("Enter number #" + counter + ":");
//                int number = Integer.parseInt(scanner.nextLine());
                double number = Double.parseDouble(scanner.nextLine());
                sum += number;
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);

        System.out.println("The sum of your numbers is " + sum);
    }
}
