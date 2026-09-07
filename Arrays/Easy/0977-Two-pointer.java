class Solution {
    public int[] sortedSquares(int[] nums){
        int left=0;
        int right=nums.length-1;
        int [] ans=new int[nums.length];
        int k=nums.length-1;
        while(left<=right){
            int l=nums[left] * nums[left];
            int r=nums[right] * nums[right];
            if(l>r){
                ans[k--]=l;
                left++;
            }
            else{
                ans[k--]=r;
                right--;
            }

        }
        return ans;
    }

}