class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        int window=cardPoints.length-k;
        for(int val : cardPoints){
            total+=val;
        }
        int min=0;
        int sum=0;
        for(int i=0;i<window;i++){
            sum+=cardPoints[i];
        }
        min=sum;
        for(int i=window;i<cardPoints.length;i++){
            sum+=cardPoints[i];

            sum-=cardPoints[i-window];

            min=Math.min(sum,min);
        }
        return total-min;
    }
}