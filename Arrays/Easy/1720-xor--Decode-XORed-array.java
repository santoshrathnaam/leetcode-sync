class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int[] result=new int[n+1];
        result[0]=first;
        for(int i=1;i<n+1;i++){
            result[i]=result[i-1] ^ encoded[i-1];
        }
        return result;
    }
}