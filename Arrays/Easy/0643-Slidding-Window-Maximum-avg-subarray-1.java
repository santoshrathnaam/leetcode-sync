class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0.0;
        double avg=0;
        for(int i=0;i<k;i++){
            avg+=nums[i];
        }
        max=avg/k;
        for(int i=k;i<nums.length;i++){
            avg+=nums[i];
            avg-=nums[i-k];
            if (max < avg/k){
                max=avg/k;
            }
        }
        return max;
    }
}