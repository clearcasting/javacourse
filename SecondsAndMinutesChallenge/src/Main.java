public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(36000));
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid input: Seconds should be at least 0.";
        }
        int minutes = seconds / 60;
        int remainder = seconds % 60;
        return getDurationString(minutes, remainder);
    }

    public static String getDurationString(int minutes, int seconds) {
        if(seconds < 0 || seconds > 59 || minutes < 0) {
            return "Seconds should be 0-59 and minutes should be at least 0.";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m "+ remainingSeconds + "s";
    }
}