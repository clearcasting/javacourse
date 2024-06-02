public class Main {
    public static void main(String[] args) {
        // 6ft = 182.88 cm
        System.out.println(convertToCentimeters(72));
        System.out.println(convertToCentimeters(6,0));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
    }
}
