class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int right=nums.length-1;right>=0;right--){
            int left=0;
            int mid=right-1;
            while(left<mid){
                if (nums[left] + nums[mid] > nums[right]){
                    count+=mid-left;
                    mid--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}