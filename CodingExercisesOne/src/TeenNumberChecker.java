public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
//        should return true since 19 is in range 13 - 19

        System.out.println(hasTeen(23, 15, 42));
//        should return true since 15 is in range 13 - 19

        System.out.println(hasTeen(22, 23, 34));
//        should return false since numbers 22, 23, 34 are not in range 13-19
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int a) {
        return a >= 13 && a <= 19;
    }
}
