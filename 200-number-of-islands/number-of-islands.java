class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int c = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    c++;
                }
            }
        }
        return c++;
    }
    public void dfs(char[][] grid , int cr , int cc){
        if(cc < 0 || cr < 0 || cc >= grid[0].length || cr >= grid.length || grid[cr][cc] !='1') return;
        

        grid[cr][cc] = '#';
        dfs(grid,cr-1,cc);
        dfs(grid,cr+1,cc);
        dfs(grid,cr,cc+1);
        dfs(grid,cr,cc-1);

    }
}