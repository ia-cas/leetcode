public class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] st = new int[row][col];
        st[0][0] = grid[0][0];
        for(int i = 0; i < row; ++i){
            for (int j = (i==0)?1:0; j < col; j++) {
                int up = (i == 0) ? 10000000:st[i - 1][j];
                int left = (j == 0) ? 1000000:st[i][j-1];
                st[i][j] = grid[i][j] + (up > left ? left:up);
            }
        }
        return st[row-1][col-1];
    }
}
