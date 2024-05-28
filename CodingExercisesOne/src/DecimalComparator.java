public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        → should return true since numbers are equal up to 3 decimal places.

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        → should return false since numbers are not equal up to 3 decimal places

        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        → should return true since numbers are equal up to 3 decimal places.

        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
//        → should return false since numbers are not equal up to 3 decimal places.
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (long) (a * 1000) == (long) (b * 1000);
    }
}
