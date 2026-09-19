class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        // if(s.length() < p.length()){
        //     return
        // }
        List<Integer> res=new ArrayList<>();
        if(s.length() < p.length()){
            return res;
        }
        int[] need=new int[26];
        int[] window=new int[26];
        for(int i=0;i<p.length();i++){
            need[p.charAt(i) - 'a']++;
        }
        for(int right=0;right<n;right++){
            window[s.charAt(right) - 'a']++;
        }
        if(Arrays.equals(need,window)){
            res.add(0);
        }
        for(int right=n;right<s.length();right++){
            
            window[s.charAt(right) - 'a']++;

            int left=right-n;
            window[s.charAt(left) - 'a']--;

            if(Arrays.equals(need,window)){
                res.add(left+1);
            }
        }
        return res;
    }
}