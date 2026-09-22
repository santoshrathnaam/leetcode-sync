class Solution {
    public void ro(int left,int right,int [] nums){
        while(left < right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        ro(0,n-1,nums);
        ro(0,k-1,nums);
        ro(k,n-1,nums);


    }
}