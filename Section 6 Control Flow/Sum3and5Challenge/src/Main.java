public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int foundCounter = 0;

        for (int i = 1; i <= 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
                foundCounter++;
                System.out.println(i + " has met the condition.");
            }

            if(foundCounter == 5) {
                System.out.println("5 numbers have now met the condition, now exiting loop.");
                System.out.println("The sum of the numbers found is " + sum + ".");
                break;
            }
        }
    }
}
