class Solution {
    public String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int size = result.length();
            if (size > 0 && result.charAt(size - 1) == c) {
                result.deleteCharAt(size - 1); 
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
