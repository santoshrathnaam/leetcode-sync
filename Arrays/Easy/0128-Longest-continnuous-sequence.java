class Solution {
    
    public int longestConsecutive(int[] nums) {
        
       HashSet<Integer> set=new HashSet<>();
       int max=0;
       for(int i :nums){
        set.add(i);
       }
       for(int i : set){
        if(!set.contains(i-1)){
        int count=0;
        int current=i;
        while(set.contains(current)){
            count++;
            current++;
        }
        max=Math.max(max,count);
        
       }
       }
       return max;
    }
}