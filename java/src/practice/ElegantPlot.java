package practice;
//优雅的点
//小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。
// 小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，
// 小易现在想寻找一个算法计算出优雅的点的个数
import java.util.Scanner;

//循环找一个象限里横坐标满足在圆上（勾股定理）和为整数的个数
//个数*4：四个象限
public class ElegantPlot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int r = scanner.nextInt();
            System.out.println(num(r));
        }
    }

    public static int num(int r) {
        int count = 0;
        double r1 = Math.sqrt(r);
        for (int i = 0; i < r1; i++) {
            double j = Math.sqrt(r - i * i);
            if (Math.abs(j - Math.round(j)) <= 0.000000001) {
                count++;
            }
        }
        return count * 4;
    }
}
