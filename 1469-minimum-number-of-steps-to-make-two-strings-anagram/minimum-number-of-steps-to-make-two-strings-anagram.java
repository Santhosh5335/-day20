class Solution {
    public int minSteps(String s, String t) {

        int[] freq = new int[26];
        for(char ch : t.toCharArray()) {
            freq[ch - 'a']++;
        }

        int count = 0;
        for(char ch : s.toCharArray()) {
            if(freq[ch - 'a'] == 0) {
                count++;
            }
            if(freq[ch - 'a'] > 0) {
                freq[ch - 'a']--;
            }
        }
        return count;
    }
}