public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount + tonerLevel > 100 || tonerAmount + tonerLevel < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        if (duplex) {
            int duplexPages = pages / 2 + pages % 2;
            pagesPrinted += duplexPages;
            System.out.println("This is a duplex printer");
            return duplexPages;
        }
        pagesPrinted += pages;
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
