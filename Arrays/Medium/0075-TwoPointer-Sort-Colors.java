class Solution {
    void swap(int [] arr,int l,int r){
        int t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;
    }
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length-1;
        while(mid<=right){
            if (nums[mid]==0){
                swap(nums,left,mid);
                left++;
                mid++;
            }
            else if (nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            }
        }
    }
}