public class Printer {
    private int pagesRemaining;
    private int tonerRemaining;

    public Printer(int pagesRemaining, int tonerRemaining) {
        this.pagesRemaining = pagesRemaining;
        this.tonerRemaining = tonerRemaining;
    }

    public int getPagesRemaining() {
        return this.pagesRemaining;
    }

    public int getTonerRemaining() {
        return this.tonerRemaining;
    }

    public boolean print(int pages, int copies) {
        if (this.pagesRemaining >= pages * copies) {
            this.pagesRemaining -= pages * copies;
            this.tonerRemaining -= pages * copies;
            return true;
        } else {
            return false;
        }
    }
}
