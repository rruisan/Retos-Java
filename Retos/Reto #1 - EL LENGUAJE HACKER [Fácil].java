/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
        // Create a dictionary mapping Spanish characters to their "leet" equivalents
		Map<Character, String> spanishLeetDictionary = createSpanishLeetDictionary();
		
		// Input phrase to be converted
	    String phrase = "Esto es una frase de prueba";
	    
	    // Convert the phrase to a vector of characters in lower case
	    char[] phrase_vectorized = phrase.toLowerCase().toCharArray();
	    
	    // Convert the phrase using the "leet" dictionary
	    String phrase_converted = convertPhrase(phrase_vectorized, spanishLeetDictionary);
	    System.out.println(phrase_converted);
	}
	
	public static String convertPhrase(char[] phrase_vectorized, Map<Character, String> spanishLeetDictionary){
	    String phrase_converted = "";
	    
	     for (char c : phrase_vectorized){
	        if (c != ' '){
	            phrase_converted += spanishLeetDictionary.get(c);
	        }
	        else{
	            phrase_converted += " ";
	        }
	    }
	    
	    
	    return phrase_converted;
	}
	
	public static Map<Character, String> createSpanishLeetDictionary() {
        Map<Character, String> spanishLeetDictionary = new HashMap<>();
        spanishLeetDictionary.put('a', "4");
        spanishLeetDictionary.put('b', "8");
        spanishLeetDictionary.put('c', "(");
        spanishLeetDictionary.put('d', "|)");
        spanishLeetDictionary.put('e', "3");
        spanishLeetDictionary.put('f', "|=");
        spanishLeetDictionary.put('g', "9");
        spanishLeetDictionary.put('h', "|-|");
        spanishLeetDictionary.put('i', "!");
        spanishLeetDictionary.put('j', "_|");
        spanishLeetDictionary.put('k', "|<");
        spanishLeetDictionary.put('l', "1");
        spanishLeetDictionary.put('m', "|\\/|");
        spanishLeetDictionary.put('n', "|\\|");
        spanishLeetDictionary.put('o', "0");
        spanishLeetDictionary.put('p', "|>");
        spanishLeetDictionary.put('q', "0,");
        spanishLeetDictionary.put('r', "|2");
        spanishLeetDictionary.put('s', "$");
        spanishLeetDictionary.put('t', "7");
        spanishLeetDictionary.put('u', "|_|");
        spanishLeetDictionary.put('v', "\\/");
        spanishLeetDictionary.put('w', "\\/\\/");
        spanishLeetDictionary.put('x', "><");
        spanishLeetDictionary.put('y', "`/");
        spanishLeetDictionary.put('z', "2");

        return spanishLeetDictionary;
    }
}
