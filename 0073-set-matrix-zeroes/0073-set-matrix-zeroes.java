class Solution {
    public void setZeroes(int[][] matrix) {
        boolean first=false;
        int width=matrix[0].length;
        int height=matrix.length;

        for(int i=0;i<width;i++){
            if(matrix[0][i]==0){
                first=true;
                break;
            }
        }
        for(int j=1;j<height;j++){
            for(int i=0;i<width;i++){
                if(matrix[j][i]==0){
                    matrix[0][i]=0;
                    matrix[j][0]=0;            
                }
            }
        }
        for(int j=1;j<height;j++){
            if(matrix[j][0]==0){
                for(int i=0;i<width;i++){
                matrix[j][i]=0;
                }
            }
        }
        for(int i=0;i<width;i++){
            if(matrix[0][i]==0){
                for(int j=1;j<height;j++){
                    matrix[j][i]=0;
                }
            }
        }
        if(first){
            for(int i=0;i<width;i++){
                matrix[0][i]=0;
            }
        }


    }
}