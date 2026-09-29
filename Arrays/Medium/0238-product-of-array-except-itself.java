class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];

        int pdt=1;
        for(int left=0;left<n;left++){
            res[left]=pdt;
            pdt*=nums[left];
        }
         pdt=1;

        for(int right=n-1;right>=0;right--){

            res[right]*=pdt;
            pdt*=nums[right];
        }
        return res;
    }
}