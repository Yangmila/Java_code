package dailyOneprobleme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//红与黑
public class RadAndBlack {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stz = new StringTokenizer("");
    static String nextLine() throws Exception {// 读取下一行字符串
        return br.readLine();
    }
    static String next() throws Exception {// 读取下一个字符串
        while (!stz.hasMoreTokens()) {
            stz = new StringTokenizer(br.readLine());
        }
        return stz.nextToken();
    }
    static int nI() throws Exception {// 读取下一个int型数值
        return Integer.parseInt(next());
    }
    static double nD() throws Exception {// 读取下一个double型数值
        return Double.parseDouble(next());
    }
    static long nL() throws Exception {// 读取下一个double型数值
        return Long.parseLong(next());
    }
    static void write(String str) throws Exception{
        bw.write(str);
    }
    static String itoS(int i){
        return Integer.toString(i);
    }
    static void wI(int i) throws Exception{
        write(Integer.toString(i));
    }
    static void wL() throws Exception{
        write("\n");
    }
    static void flush() throws Exception{
        bw.flush();
    }
    public static void main(String[] args) throws Exception{
        new RadAndBlack().run();
    }

    //
    final int N = 25;
    char[][] g = new char[N][];
    boolean[][] st;
    int n, m;
    int sx, sy;
    int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    // 返回这个点的联通数量
    int dfs(int x, int y){
        st[x][y] = true;
        int cnt = 1;
        for (int i = 0; i < 4; i++) {
            int a = dx[i] + x , b = y + dy[i];
            if (a < 0 || a >= n || b < 0 || b >= m) continue;
            if (st[a][b] || g[a][b] == '#') continue;
            // 如果a b 可以走动
            cnt += dfs(a, b);
        }
        return cnt;

    }
    public void run() throws Exception{
        while (true){
            m = nI(); n = nI();
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                g[i] = nextLine().toCharArray();
            }
            st = new boolean[N][N];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // 找到初始起点
                    if (g[i][j] == '@'){
                        sx = i; sy = j;
                    }
                }
            }
            wI(dfs(sx, sy));
            wL();
        }
        flush();
    }
}
