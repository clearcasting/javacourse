public class MegaBytesConverter {
    public static void main(String[] args) {

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mbValue = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + mbValue + " MB and " + remainder + " KB");
        }

        // XX represents the original value kiloBytes.
        // YY represents the calculated megabytes.
        // ZZ represents the calculated remaining kilobytes.
    }
}
