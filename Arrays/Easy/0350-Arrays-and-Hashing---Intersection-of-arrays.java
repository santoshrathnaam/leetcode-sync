class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : nums2){
            if(map.getOrDefault(i,0) > 0){
                res.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int[]result=new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
}