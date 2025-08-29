class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        while (i < word.length() && j < abbr.length()) {
            char c = abbr.charAt(j);
            if (Character.isDigit(c)) {
                if (c == '0') return false;
                int num = 0;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += num;
                if (i > word.length()) return false;
            } else {
                if (word.charAt(i) != c) return false;
                i++;
                j++;
            }
        }
        return i == word.length() && j == abbr.length();
    }
}
