class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int area=0;
            if(height[l]<=height[r]){
                area=height[l]*(r-l);
                l++;
            }
            else if(height[l]>height[r]){
                area=height[r]*(r-l);
                r--;
            }
            maxarea=Math.max(area,maxarea);

        }
        return maxarea;
    }
}