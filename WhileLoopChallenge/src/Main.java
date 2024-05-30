public class Main {
    public static void main(String[] args) {

        int start = 4;
        int finish = 20;
        int evenCounter = 0;
        int oddCounter = 0;

        while (start <= finish) {
            start++;
            if (!isEvenNumber(start)) {
                oddCounter++;
                continue;
            }

            System.out.println(start + " is an even number.");
            evenCounter++;

            if(evenCounter >= 5) {
                System.out.println("\n" + evenCounter + " even numbers found!");
                System.out.println(oddCounter + " odd numbers found!");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
