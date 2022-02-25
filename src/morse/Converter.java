package morse;

import java.util.HashMap;

public class Converter {

    //Attributet
    private HashMap<String, String> morse;


    //Konstruktor
    public Converter() {
        morse = new HashMap<String, String>();
        morse.put("A", "*-");
        morse.put("*-", "A");
        morse.put("B", "-***");
        morse.put("-***", "B");
        morse.put("C", "-*-*");
        morse.put("-*-*", "C");
        morse.put("D", "-**");
        morse.put("-**", "D");
        morse.put("E", "*");
        morse.put("*", "E");
        morse.put("F", "**-*");
        morse.put("**-*", "F");
        morse.put("G", "--*");
        morse.put("--*", "G");
        morse.put("H", "****");
        morse.put("****", "H");
        morse.put("I", "**");
        morse.put("**", "I");
        morse.put("J", "*---");
        morse.put("*---", "J");
        morse.put("K", "-*-");
        morse.put("-*-", "K");
        morse.put("L", "*-**");
        morse.put("*-**", "L");
        morse.put("M", "--");
        morse.put("--", "M");
        morse.put("N", "-*");
        morse.put("-*", "N");
        morse.put("O", "---");
        morse.put("---", "O");
        morse.put("P", "*--*");
        morse.put("*--*", "P");
        morse.put("Q", "--*-");
        morse.put("--*-", "Q");
        morse.put("R", "*-*");
        morse.put("*-*", "R");
        morse.put("S", "***");
        morse.put("***", "S");
        morse.put("T", "-");
        morse.put("-", "T");
        morse.put("U", "**-");
        morse.put("**-", "U");
        morse.put("V", "***-");
        morse.put("***-", "V");
        morse.put("W", "*--");
        morse.put("*--", "W");
        morse.put("X", "-**-");
        morse.put("-**-", "X");
        morse.put("Y", "-*--");
        morse.put("-*--", "Y");
        morse.put("Z", "--**");
        morse.put("--**", "Z");
        morse.put("1", "*----");
        morse.put("*----", "1");
        morse.put("2", "**---");
        morse.put("**---", "2");
        morse.put("3", "***--");
        morse.put("***--", "3");
        morse.put("4", "****-");
        morse.put("****-", "4");
        morse.put("5", "*****");
        morse.put("*****", "5");
        morse.put("6", "-****");
        morse.put("-****", "6");
        morse.put("7", "--***");
        morse.put("--***", "7");
        morse.put("8", "---**");
        morse.put("---**", "8");
        morse.put("9", "----*");
        morse.put("----*", "9");
        morse.put("0", "-----");
        morse.put("-----", "0");
        morse.put(".", "*-*-*-");
        morse.put("*-*-*-", ".");
        morse.put(",", "--**--");
        morse.put("--**--", ",");
        morse.put("?", "**--**");
        morse.put("**--**", "?");
    }

    public String toMorse(String testdata) {
        String text = morse.get(testdata);

        //felhantering
        if (text == null) {
            text = "Fel inmatning, försök igen!";
        }

        return text;

    }

}
