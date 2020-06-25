package com.leo.algorithm;

public class MinPathSum {

    public int minPathSum(int[][] grid) {
        int res = 0;
        int[][] dp = new int[grid.length][grid[0].length];
        if (grid[0].length == 0) {
            return 0;
        }

        //本质变为一个一维数组
        if (grid.length == 1) {
            for (int i = 0; i < grid[0].length; i++) {
                res += grid[0][i];
            }
            return res;
        }

        //初始化dp表
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < grid[0].length; i++) {
            for (int j = 1; j < grid.length; j++) {
                int pre = Math.min(dp[j - 1][i], dp[j][i - 1]);
                dp[j][i] = pre + grid[j][i];
            }
        }

        return dp[grid.length - 1][grid[0].length];
    }

}
