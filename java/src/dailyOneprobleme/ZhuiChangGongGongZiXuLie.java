package dailyOneprobleme;

import java.util.Scanner;
// 最长递增子序列  &  最长公共子序列
public class ZhuiChangGongGongZiXuLie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String[] line = scanner.nextLine().split(" ");

            System.out.println(help(line[0], line[1]));
        }

    }

    public static int help(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];


        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++){
                if (s1.charAt(i) == s2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + 1;
                }else{
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
