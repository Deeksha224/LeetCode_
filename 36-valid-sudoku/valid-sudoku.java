class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] -'1'; //working with 0 index
                    int idx = (i/3)*3 + (j/3);

                    if(rows[i][num] || cols[j][num] || boxes[idx][num]) return false;
                    rows[i][num] = cols[j][num] = boxes[idx][num] =true;
                }
            }
        }
        return true;
    }
}