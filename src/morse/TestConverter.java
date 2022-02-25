package morse;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestConverter {

    @Test
    public void testConvertD() {
        //Arrange, vilka värden ska vi testa mot
        Converter converter = new Converter();

        //Konvertera D till -**
        String testdata = "D";

        //Act, själva beräkningen av klassen, sparar resultatet
        String actual = converter.toMorse(testdata);

        //Assert, jämför om vi fick rätt resultat
        //expected, vad vi förväntar oss, actual (Det faktiska resultatet)
        assertEquals("-**", actual);
    }

    @Test
    public void convertToEng() {
        //Arrange, vilka värden ska vi testa mot
        Converter converter = new Converter();

        //Konvertera -- till M
        String testdata = "--";

        //Act, själva beräkningen av klassen, sparar resultatet
        String actual = converter.toMorse(testdata);

        //Assert, jämför om vi fick rätt resultat
        //expected, vad vi förväntar oss, actual (Det faktiska resultatet)
        assertEquals("M", actual);

}

    @Test
    public void testOfNull() {
        //Arrange, vilka värden ska vi testa mot
        Converter converter = new Converter();

        //Konvertera -- till M
        String testdata = "&";

        //Act, själva beräkningen av klassen, sparar resultatet
         String actual =  converter.toMorse(testdata);

        //Assert, jämför om vi fick rätt resultat
        //expected, vad vi förväntar oss, actual (Det faktiska resultatet)
        assertEquals("Fel inmatning, försök igen!", actual);
    }


    @Test
    public void convertStarToEng() {
        //Arrange, vilka värden ska vi testa mot
        Converter converter = new Converter();

        //Konvertera -- till M
        String testdata = "*";

        //Act, själva beräkningen av klassen, sparar resultatet
        String actual = converter.toMorse(testdata);

        //Assert, jämför om vi fick rätt resultat
        //expected, vad vi förväntar oss, actual (Det faktiska resultatet)
        assertEquals("E", actual);

    }



}


