class Solution {
    public String minWindow(String s, String t) {
        int left=0;
        int min=Integer.MAX_VALUE;
        int start=0;
        int count=0;
        if (s.length()<t.length()){
            return "";
        }
        int[] need=new int[128] ;
        for(int i=0;i<t.length();i++){
            need[t.charAt(i)]++;
        }
        for(int right=0 ; right < s.length() ; right++){
            char ch=s.charAt(right);
            if(need[ch]>0){
                count++;
            }
            need[ch]--;
            while(count==t.length()){
                if(right-left+1 < min){
                    min=right-left+1;
                    start=left;
                }
                char remove=s.charAt(left);
                if(need[remove] >= 0){
                    count--;
                }
                need[remove]++;
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+min);
    }
}