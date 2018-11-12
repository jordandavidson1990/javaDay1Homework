import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

        Printer printer;

        @Before
        public void before(){
            printer = new Printer();
        }

        @Test
        public void hasPages(){
            assertEquals(100, printer.getNumberOfPaper());
        }

        @Test
        public void hasToner(){
            assertEquals(50, printer.getNumberOfToner());
        }

        @Test
        public void canReducePaperBy1IfPrinted(){
            printer.print1Page();
            assertEquals(99, printer.getNumberOfPaper());
        }

        @Test
        public void canCheckIfEnoughPaperIsInStock(){
            assertEquals(true, printer.hasEnoughPaper(10));
        }

        @Test
        public void canCheckifThereIsNotEnoughPaperInStock(){
            assertEquals(false, printer.hasEnoughPaper(101));
        }

        @Test
        public void canReduceToner(){
            printer.print1Page();
            assertEquals(49, printer.getNumberOfToner());
        }

        @Test
        public void canPrintPages(){
            printer.hasEnoughPaper(10);
            printer.print1Page();
            printer.print1Page();
            printer.print1Page();
            printer.print1Page();
            printer.print1Page();
            assertEquals(95, printer.getNumberOfPaper());
        }

        @Test
        public void canRefillPaper(){
            printer.print1Page();
            printer.refillPaper();
            assertEquals(100, printer.getNumberOfPaper());
        }

        @Test
        public void canPrint(){
            printer.print(10, 2);
            assertEquals(80, printer.getNumberOfPaper());
        }
}
