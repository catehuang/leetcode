package easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class _14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String result = "";
        boolean isEnd = false;
        for (int i = 0; i < strs[0].length(); i++) {
            int count = 0;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i) {
                    if (strs[j].charAt(i) != strs[0].charAt(i)) {
                        isEnd = true;
                    }
                } else {
                    isEnd = true;
                }
            }

            if (isEnd) {
                return result;
            } else {
                result += strs[0].charAt(i);
            }
        }
        return result;
    }
}
