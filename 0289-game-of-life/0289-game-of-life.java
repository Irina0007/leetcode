class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int record=0;

                for(int row=i-1;row<=i+1;row++){
                    for(int col=j-1;col<=j+1;col++){

                        if(row<0||row>=n||col<0||col>=m){
                            continue;
                        }
                        if(row==i&&col==j){
                            continue;
                        }
                        if(board[row][col]==1||board[row][col]==2){
                            record++;
                        }
                    }
                }
                if(board[i][j]==0){
                    if(record==3){
                        board[i][j]=3;
                    }
                }
                if(board[i][j]==1){
                    if(record<2||record>3){
                        board[i][j]=2;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==2){
                    board[i][j]=0;
                }
                if(board[i][j]==3){
                    board[i][j]=1;
                }

            }
        }
        
    }
}