public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
//        → should print "525600 min = 1 y and 0 d"

        printYearsAndDays(1051200);
//        → should print "1051200 min = 2 y and 0 d"

        printYearsAndDays(561600);
//        → should print "561600 min = 1 y and 25 d"

    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int days = (int) minutes / 1440;
            int remainingDays = days % 365;
            int years = days / 365;

            System.out.println(minutes + " min = " + years + " y and "+ remainingDays + " d");
        }
    }
}
