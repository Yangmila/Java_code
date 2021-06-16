package practice;
//牛牛总是睡过头，所以他定了很多闹钟，只有在闹钟响的时候他才会醒过来并且决定起不起床。
// 从他起床算起他需要X分钟到达教室，上课时间为当天的A时B分，请问他最晚可以什么时间起床
import java.util.Scanner;
//第一步：将小时化为分钟，添加到数组里，
//第二步：遍历数组 ， 遍历的同时分为以下几步  ：
//1.判断当前时间会不会迟到  也就是 所剩时间 = （到校时间-路程-闹钟）如果小于0肯定迟到了
//2.如果大于零，我们找所剩时间最小的(可以等于0) 把 i 的位置赋值给min a[min]就是最迟的闹钟了
//3.分钟/60所得的就是小时  分钟%60所得的就是剩下的分钟；
public class NiuNiuDeNaoZhong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int h = 0;
            int m = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                h = scanner.nextInt();
                m = scanner.nextInt();
                a[i] = h * 60 + m;
            }
            int luShi = scanner.nextInt();
            int sH = scanner.nextInt();
            int sM = scanner.nextInt();
            int sS = sH * 60 + sM;
            int min = 0;

            for (int i = 0; i < a.length; i++) {
                if (sS - (luShi + a[i]) < 0){
                    continue;
                }else {
                    if (sS - (luShi + a[i]) < sS - (luShi + a[min])){
                        min = i;
                    }
                }
            }
            System.out.println(a[min] / 60 + " " + a[min] % 60);
        }
    }
}
