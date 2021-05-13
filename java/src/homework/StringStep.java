package homework;

import java.util.Scanner;

//计算字符串的距离
public class StringStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String strA = scanner.next();
            String strB = scanner.next();
            int ic = 1;
            int dc = 1;
            int rc = 1;
            int cost = strEditCost(strA, strB, ic, dc, rc);
            System.out.println(cost);
        }
    }

    public static int strEditCost(String strA, String strB, int ic, int dc, int rc) {
        int m = strA.length();
        int n = strB.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= n; i++) dp[0][i] = i*ic;
        for (int i = 1; i <= m; i++) dp[i][0] = i*dc;
        for (int x = 1; x <= m; x++) {
            for (int y = 1; y <= n; y++) {
                int cost1 = dp[x-1][y] + dc;
                int cost2 = dp[x][y-1] + ic;
                int cost3 = 0;
                if(strA.charAt(x-1) == strB.charAt(y-1))
                    cost3 = dp[x-1][y-1];
                else
                    cost3 = dp[x-1][y-1] + rc;
                dp[x][y] = Math.min(cost1, cost2);
                dp[x][y] = Math.min(dp[x][y], cost3);
            }
        }
        return dp[m][n];
    }
}
