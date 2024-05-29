public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
//        → should return 31 since January has 31 days.

        System.out.println(getDaysInMonth(2, 2020));
//        → should return 29 since February has 29 days in a leap year and 2020 is a leap year.

        System.out.println(getDaysInMonth(2, 2018));
//        → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.

        System.out.println(getDaysInMonth(-1, 2020));
//        → should return -1 since the parameter month is invalid.

        System.out.println(getDaysInMonth(1, -2020));
//        → should return -1 since the parameter year is outside the range of 1 to 9999.

    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }

        return switch(month) {
            case 1 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
    }
}
