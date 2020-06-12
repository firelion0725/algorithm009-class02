class NumIsland {

    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int height = grid.length;
        int width = grid[0].length;
        int result = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, j, i, width, height);
                    result++;
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int x, int y, int width, int height) {
        if (x < 0 || x >= width || y < 0 || y >= height || grid[y][x] == '0') {
            return;
        }

        grid[y][x] = '1';
        dfs(grid, x - 1, y, width, height);
        dfs(grid, x + 1, y, width, height);
        dfs(grid, x, y - 1, width, height);
        dfs(grid, x, y + 1, width, height);
    }

}