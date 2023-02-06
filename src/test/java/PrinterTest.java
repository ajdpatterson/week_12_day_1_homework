import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    private Printer printer;

    @Before
    public void setup() {
        printer = new Printer(10, 100);
    }

    @Test
    public void printerHasPages() {
        assertEquals(10, printer.getPagesRemaining());
    }
    @Test
    public void canPrint() {
        printer.print(2, 3);
        assertEquals(4, printer.getPagesRemaining());
        assertEquals(94, printer.getTonerRemaining());
    }

    @Test
    public void cannotPrint() {
        assertFalse(printer.print(5, 3));
    }

    @Test
    public void printerHasToner() {
        assertEquals(100, printer.getTonerRemaining());
    }

}
