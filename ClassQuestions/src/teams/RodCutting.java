package teams;

public class RodCutting {
	 
    public static int cutRod(int[] price, int n) {
 
        int[] dp = new int[n + 1];
        dp[0] = 0;
 
        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
 
            for (int j = 1; j <= i; j++) {
                maxVal = Math.max(maxVal, price[j - 1] + dp[i - j]);
            }
 
            dp[i] = maxVal;
        }
 
        return dp[n];
    }
 
    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = price.length;
 
        System.out.println(cutRod(price, n));
    }
}