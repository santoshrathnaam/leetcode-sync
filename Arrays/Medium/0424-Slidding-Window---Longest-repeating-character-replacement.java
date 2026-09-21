class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int maxFreq=0;
        int []count=new int[26];
        for(int right=0;right<s.length();right++){
            count[s.charAt(right) - 'A']++;

            maxFreq=Math.max(maxFreq ,count[s.charAt(right) - 'A'] );
            int window=right-left+1;
            int replacement=window - maxFreq;
            while( replacement > k){
                count[s.charAt(left) - 'A']--;

                left++;

                window=right-left+1;
                replacement=window-maxFreq;
            }
            max=Math.max(max,window);
        }
        return max;
    }
}