package morse;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {

        Converter morseCode = new Converter();
        System.out.println("Skriv en bokstav (A-Z), en siffra (0-9), ett tecken ( . , ?) eller Morse kod :");

        Scanner input = new Scanner(System.in);


        //En oändlig loop som läser in
        while (true) {
            String userInput = input.next();

            // felhantering
            if (userInput.matches("ö|ä|å|Ö|Ä|Å")) {
                System.out.println(" Inga svenska bokstäver (Ö, Ä och Å! ). Försök igen!");
            } else {
                System.out.println(morseCode.toMorse(userInput));



            }

        }
    }
}


