////////////////////////////////////////////////////////////////////
// [Francesco] [Marcon] [2101070]
// [Alberto] [Reginato] [2110450]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder arteAscii = new StringBuilder();
    
        String[][] lettere= {
            { 
                "  __  __ ",  "  _____  ", "   _____ ", "  _      ", " __   __", " __      __", "  _____ " 
            },

            {
                " |  \\/  |", " |  __ \\ ", "  / ____|", " | |     ", " \\ \\ / /", " \\ \\    / /", " |_   _|"
            },

            {
                " | \\  / |", " | |  | |", " | |     ", " | |     ", "  \\ V / ", "  \\ \\  / / ",  "   | |  " 
            },

            {
                " | |\\/| |", " | |  | |", " | |     ", " | |     ", "   > <  ", "   \\ \\/ /  ",  "   | |  " 
            },
                
            {
                " | |  | |", " | |__| |", " | |____ ", " | |____ ", "  / . \\ ", "    \\  /   ",  "  _| |_ " 
            },
                
            {
                " |_|  |_|", " |_____/ ", "  \\_____|", " |______|", " /_/ \\_\\", "     \\/    ",  " |_____|" 
            },
        };
        
        for (int riga = 0; riga < 6; riga++) {
            for (char carattere : romanNumber.toCharArray()) {
                arteAscii.append(lettere[riga]["MDCLXVI".indexOf(carattere)]);
            }
            arteAscii.append("\n");
        }
        return arteAscii.toString();
    }
}
