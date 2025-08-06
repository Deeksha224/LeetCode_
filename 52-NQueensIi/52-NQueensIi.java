// Last updated: 8/6/2025, 11:11:53 AM
class Solution {
    public int totalNQueens(int n) {
        List<List<String>> li = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        Print(board, n,0,li);
        return li.size();   
    }
    static int count ;
    public static void Print(boolean[][] board, int tq, int row , List<List<String>> li) {
		if (tq == 0) {
            List<String> l = new ArrayList<>();
			for (int i = 0; i < row; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < row; j++) {
                    if (board[i][j]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                l.add(sb.toString());
            }
            li.add(l);
            count++;
            return;
        }
		
		for (int col = 0; col < board[0].length; col++) {
			if (issafe(board, row, col)) {
				board[row][col] = true;
				Print(board, tq - 1, row + 1, li);
				board[row][col] = false;
			}

		}
	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		// up
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		r = row;
		int c = col;
		// left daigonal
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		// right daigonal
		r = row;
		c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
    }
}
