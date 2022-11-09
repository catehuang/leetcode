package easy;

/**
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 */
public class _557_ReverseWordsInAStringIII {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            for (int i = word.length() - 1; i > -1; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
        // remove the last space
        result.deleteCharAt(result.length()-1);
        return result.toString();

        /* method 2 - slower
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.insert(len, s.charAt(i));
            }
            else {
                result.append(word).append(" ");
                word.delete(0, word.length());
                len = 0;
            }
        }
        result.append(word);
        return result.toString();
        */
    }
}
