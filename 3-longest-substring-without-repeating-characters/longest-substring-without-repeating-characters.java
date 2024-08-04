class Solution {
    public int lengthOfLongestSubstring(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int[] seen = new int[256];
        int maxLen = 1;
        for (int i = 0, s = 0; i < str.length(); i++) {
            s = Math.max(s, seen[str.charAt(i)]);
            maxLen = Math.max(maxLen, i - s + 1);
            seen[str.charAt(i)] = i + 1;
        }
        return maxLen;
    }
}