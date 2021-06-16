package practice;
//迷路的牛牛
//牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。
// 虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
import java.util.Scanner;
//从北开始，顺时针旋转，将N,E,S,W分别记为0,1,2,3，
// 左转相当于逆时针转，即-1；右转+1。避免结果为负数加4再对4取余。
public class MiLuNiuNiu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int ret = 0;
            char[] dir = {'N','E','S','W'};
            String str = scanner.next();

            for (int i = 0; i < n; i++) {
                ret = (ret + (str.charAt(i) == 'L' ? -1 : 1) + 4) % 4;
            }
            System.out.println(dir[ret % 4]);
        }
    }
}
