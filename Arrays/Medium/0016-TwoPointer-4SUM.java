class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int resultsum=nums[0]+nums[1]+nums[2];
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res =new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length-3;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum==target){
                        res.add(Arrays.asList(
                            nums[i],nums[j],nums[left],nums[right]
                        ));
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right+1]){
                            right--;
                        }
                        
                    }
                    else if (sum<target){

                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
            
        }
        return res;
    }
}
            int left=i+1;
            int right=nums.length-1;
            
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if (sum==target){
                    return target;
                }
                if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                int diff=Math.abs(sum-target);
                if(diff<mindiff){
                    mindiff=diff;
                    resultsum=sum;
                }
            }
        }  
        return resultsum;
    }
}