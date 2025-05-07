////////////////////////////////////////////////////////////////////
// [Francesco] [Marcon] [2101070]
// [Alberto] [Reginato] [2110450]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    @Test
    public void testPrint1_3() {
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", RomanPrinter.print(1));
        assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", RomanPrinter.print(2));
        assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", RomanPrinter.print(3));
    }

    @Test
    public void testPrint4_6() {
        assertEquals("  _____  __      __\n |_   _| \\ \\    / /\n   | |    \\ \\  / / \n   | |     \\ \\/ /  \n  _| |_     \\  /   \n |_____|     \\/    \n", RomanPrinter.print(4));
        assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n", RomanPrinter.print(5));
        assertEquals(" __      __  _____ \n \\ \\    / / |_   _|\n  \\ \\  / /    | |  \n   \\ \\/ /     | |  \n    \\  /     _| |_ \n     \\/     |_____|\n", RomanPrinter.print(6)); 
    }

}