package homework;

//年终奖
public class YearMoney {
    public int getMost(int[][] board) {
        for (int i = 1; i < board[0].length; i++) {
            board[0][i] += board[0][i-1];
        }

        for (int i = 1; i < board.length; i++) {
            board[i][0] += board[i-1][0];
        }

        /*遍历每一行*/
        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {
                int a = board[i-1][j];
                int b = board[i][j-1];
                board[i][j] += a>b? a: b;
            }
        }

        int len = board.length;
        int sublen = board[len-1].length;
        return board[len-1][sublen-1];
    }
}
