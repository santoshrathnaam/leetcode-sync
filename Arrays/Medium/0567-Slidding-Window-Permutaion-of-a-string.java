class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int n=s1.length();
        int []need=new int[26];
        int []window=new int[26];
        for(int i=0;i<s1.length();i++){
            need[s1.charAt(i) - 'a']++;
        }
        for(int right=0;right < n;right++){
            window[s2.charAt(right) - 'a']++;
        }
        if(Arrays.equals(need,window)){
            return true;
        }
        for(int right=n;right<s2.length();right++){
            window[s2.charAt(right) - 'a'] ++;
            window[s2.charAt(right-n) - 'a']--;
            if(Arrays.equals(need,window)){
                return true;
            }
        }
        return false;
    }
}