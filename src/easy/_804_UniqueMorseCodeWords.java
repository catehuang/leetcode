package easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
 *
 * 'a' maps to ".-",
 * 'b' maps to "-...",
 * 'c' maps to "-.-.", and so on.
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
 *
 * For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
 * We will call such a concatenation the transformation of a word.
 * Return the number of different transformations among all words we have.
 */
public class _804_UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> hashSet = new HashSet<>();
        for (String str: words) {
            String word = getMorseCode_2(str);
            if (!hashSet.contains(word)) {
                hashSet.add(word);
            }
        }
        return hashSet.size();
    }

    private String getMorseCode_2(String str) {
        String result = "";
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (Character c : str.toCharArray()) {
            result += morseCode[c-97];
        }
        return result;
    }

    private String getMorseCode_1(String str) {
        String[] s = str.split("");
        String morseCode = "";
        for (String c : s) {
            switch (c) {
                case "a":
                    morseCode += "._";
                    break;
                case "b":
                    morseCode += "_...";
                    break;
                case "c":
                    morseCode += "_._.";
                    break;
                case "d":
                    morseCode += "_..";
                    break;
                case "e":
                    morseCode += ".";
                    break;
                case "f":
                    morseCode += ".._.";
                    break;
                case "g":
                    morseCode += "__.";
                    break;
                case "h":
                    morseCode += "....";
                    break;
                case "i":
                    morseCode += "..";
                    break;
                case "j":
                    morseCode += ".___";
                    break;
                case "k":
                    morseCode += "_._";
                    break;
                case "l":
                    morseCode += "._..";
                    break;
                case "m":
                    morseCode += "__";
                    break;
                case "n":
                    morseCode += "_.";
                    break;
                case "o":
                    morseCode += "___";
                    break;
                case "p":
                    morseCode += ".__.";
                    break;
                case "q":
                    morseCode += "__._";
                    break;
                case "r":
                    morseCode += "._.";
                    break;
                case "s":
                    morseCode += "...";
                    break;
                case "t":
                    morseCode += "_";
                    break;
                case "u":
                    morseCode += ".._";
                    break;
                case "v":
                    morseCode += "..._";
                    break;
                case "w":
                    morseCode += ".__";
                    break;
                case "x":
                    morseCode += "_.._";
                    break;
                case "y":
                    morseCode += "_.__";
                    break;
                case "z":
                    morseCode += "__..";
                    break;
                default:
                    break;
            }
        }
        return morseCode;
    }
}
