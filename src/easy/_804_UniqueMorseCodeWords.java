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
            hashSet.add(word);
        }
        return hashSet.size();
    }

    private String getMorseCode_2(String str) {
        StringBuilder result = new StringBuilder();
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (Character c : str.toCharArray()) {
            result.append(morseCode[c - 97]);
        }
        return result.toString();
    }

    private String getMorseCode_1(String str) {
        String[] s = str.split("");
        StringBuilder morseCode = new StringBuilder();
        for (String c : s) {
            switch (c) {
                case "a" -> morseCode.append("._");
                case "b" -> morseCode.append("_...");
                case "c" -> morseCode.append("_._.");
                case "d" -> morseCode.append("_..");
                case "e" -> morseCode.append(".");
                case "f" -> morseCode.append(".._.");
                case "g" -> morseCode.append("__.");
                case "h" -> morseCode.append("....");
                case "i" -> morseCode.append("..");
                case "j" -> morseCode.append(".___");
                case "k" -> morseCode.append("_._");
                case "l" -> morseCode.append("._..");
                case "m" -> morseCode.append("__");
                case "n" -> morseCode.append("_.");
                case "o" -> morseCode.append("___");
                case "p" -> morseCode.append(".__.");
                case "q" -> morseCode.append("__._");
                case "r" -> morseCode.append("._.");
                case "s" -> morseCode.append("...");
                case "t" -> morseCode.append("_");
                case "u" -> morseCode.append(".._");
                case "v" -> morseCode.append("..._");
                case "w" -> morseCode.append(".__");
                case "x" -> morseCode.append("_.._");
                case "y" -> morseCode.append("_.__");
                case "z" -> morseCode.append("__..");
                default -> {
                }
            }
        }
        return morseCode.toString();
    }
}
