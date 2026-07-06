class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        k=k%nums.length;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
        
    }
    public void reverse(int[] nums, int left, int right){
        while(left<right){
            int a=nums[left];
            nums[left]=nums[right];
            nums[right]=a;
            left++;
            right--;
        }
     
    }
}