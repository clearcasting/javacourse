package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] integerArray = readIntegers();
        System.out.println(Arrays.toString(integerArray));
        System.out.println(findMin(integerArray));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a list of integers separated by commas");
        String input = scanner.nextLine();
        String[] splitArray = input.split(",");

        int[] intArray = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            intArray[i] = Integer.parseInt(splitArray[i].trim());
        }

        return intArray;
    }

    private static int findMin(int[] intArray) {
        int lowestNumber = intArray[0];

        for (int element: intArray) {
            if (element < lowestNumber) {
                lowestNumber = element;
            }
        }
        return lowestNumber;
    }
}
