public class Question5 {
    public static int minimumTotal(int [][]triangle) {
        int n = triangle.length;
        int[][] dp = new int[n+1][n+1];
    
        for (int level=n-1; level>=0; level--)
            for (int i=0; i<=level; i++)
                dp[level][i] = triangle[level][i] + Math.min(dp[level+1][i], dp[level+1][i+1]);
    
        return dp[0][0];
        }
}
