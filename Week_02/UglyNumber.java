public class UglyNumber {

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int n2 = 0;
        int n3 = 0;
        int n5 = 0;

        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(dp[n2] * 2, dp[n3] * 3), dp[n5] * 5);
            if (dp[i] == dp[n2] * 2) {
                n2++;
            }
            if (dp[i] == dp[n3] * 3) {
                n3++;
            }
            if (dp[i] == dp[n5] * 5) {
                n5++;
            }
        }
        return dp[n - 1];
    }

}
