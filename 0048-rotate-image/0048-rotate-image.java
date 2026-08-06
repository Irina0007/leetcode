class Solution {
    public void rotate(int[][] matrix) {
        int left=0;
        int top=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        while(left<right&&top<bottom){
            for (int i=left;i<right;i++){
               int offset = i - left;
                int value = matrix[top][i];
                matrix[top][i]  = matrix[bottom - offset][left];
                matrix[bottom - offset][left]= matrix[bottom][right - offset];
                matrix[bottom][right - offset]= matrix[top + offset][right];
                matrix[top + offset][right] = value;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        
    }
}