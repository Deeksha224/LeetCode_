class Solution {
    public void solveSudoku(char[][] board) {
        answer(board,0,0);
    }
    public boolean answer(char[][] board,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            return true;
        }
        if(board[row][col]!='.'){
            return answer(board,row,col+1);
        }
        for(char i='1' ; i<='9' ; i++){
            if(isPossible(board,row,col,i)){
                board[row][col] = i;
                if(answer(board,row,col+1)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public boolean isPossible(char[][] board,int row , int col , char val){
        for(int i=0 ; i<9 ; i++){
            // row
            if(val==board[i][col]){
                return false;
            }
            // column
            if(board[row][i]==val){
                return false;
            }
        }

        // 3x3 matrix
        row = row/3 *3;
        col = col/3 *3;
        for(int i=row ; i<row+3 ; i++){
            for(int j=col;j<col+3 ; j++){
                if(val==board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}