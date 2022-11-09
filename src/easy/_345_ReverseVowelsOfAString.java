package easy;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
 * and upper cases, more than once.
 */
public class _345_ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] c = s.toCharArray();
        char tmp = '\0';
        while (start < end) {
            if (!isVowel(c[start])) {
                start++;
            }
            if (!isVowel(c[end])) {
                end--;
            }
            if (isVowel(c[start]) && isVowel(c[end])) {
                tmp = c[start];
                c[start] = c[end];
                c[end] = tmp;
                start++;
                end--;
            }
        }
        return String.copyValueOf(c);
    }

    private boolean isVowel(char c) {
        return (
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
        );
    }
        /* Too slow and waste memory
        List<String> list = Arrays.asList(s.split(""));
        ArrayList<Integer> vowelIndexes = new ArrayList<>();
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("a") ||
                    list.get(i).equalsIgnoreCase("e") ||
                    list.get(i).equalsIgnoreCase("i") ||
                    list.get(i).equalsIgnoreCase("o") ||
                    list.get(i).equalsIgnoreCase("u")) {
                vowelIndexes.add(i);
            }
        }
        String tmp = "";
        for (int i = 0; i < vowelIndexes.size() / 2; i++) {
            tmp = list.get(vowelIndexes.get(i));
            list.set(vowelIndexes.get(i), list.get(vowelIndexes.get(vowelIndexes.size() - 1 - i)));
            list.set(vowelIndexes.get(vowelIndexes.size() - 1 - i), tmp);
        }

        for (String item: list) {
            result += item;
        }
        return result;
        */
}
