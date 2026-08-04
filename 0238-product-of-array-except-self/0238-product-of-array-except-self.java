class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int preidx=1;
        for(int i=0;i<n;i++){
            res[i]=preidx;
            preidx=preidx*nums[i];
        }
        int postidx=1;
        for(int j=n-1;j>=0;j--){
            res[j]=res[j]*postidx;
            postidx=postidx*nums[j];
        }
        return res;
        
    }
}