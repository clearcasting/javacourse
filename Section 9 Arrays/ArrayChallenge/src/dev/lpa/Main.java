package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();

        int[] sorted = Arrays.copyOf(randomArray, randomArray.length);
        Arrays.sort(sorted);
        System.out.println("After Arrays.sort:");
        System.out.println(Arrays.toString(sorted));

        for (int i = 0; i < sorted.length / 2; i++) {
            int minElement;
            minElement = sorted[i];

            sorted[i] = sorted[sorted.length - (1 + i)];
            sorted[sorted.length - (1 + i)] = minElement;
        }
        System.out.println("After for loop:");
        System.out.println(Arrays.toString(sorted));
    }

public static int[] generateRandomArray() {
        Random random = new Random();

        int[] randomArray = new int[5];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }

        return randomArray;
    }
}
