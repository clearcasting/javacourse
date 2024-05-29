public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
//        should print text All numbers are equal

        printEqual(1, 1, 2);
//        should print text Neither all are equal or different

        printEqual(-1, -1, -1);
//        should print text Invalid Value

        printEqual(1, 2, 3);
//        should print text All numbers are different
    }

    public static void printEqual(int x, int y, int z) {
        if(x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if(x == y && x == z) {
            System.out.println("All numbers are equal");
        } else if(x == y || x == z || z == y) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
