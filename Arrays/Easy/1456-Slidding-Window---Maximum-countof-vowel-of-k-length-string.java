class Solution {
    public static boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
     int count=0;
     int m=0;
     for(int i=0;i<k;i++){
        if(isvowel(Character.toLowerCase(s.charAt(i)))){
            count++;
        }
     }
     m=count;
     for(int i=k;i<s.length();i++){
        if(isvowel(Character.toLowerCase(s.charAt(i)))){
            count++;
        }
        if(isvowel(Character.toLowerCase(s.charAt(i-k)))){
            count--;
        }
        m=Math.max(m,count);
     }   
    return m;

    }
}