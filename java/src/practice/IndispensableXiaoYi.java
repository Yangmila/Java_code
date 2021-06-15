package practice;
//独立的小易
//小易每天必须吃一个水果并且需要每天支付x元的房屋租金。
// 当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,商店每个水果售卖p元。
// 小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。
import java.util.Scanner;
//只有两种情况,已有水果个数比现有的钱除以房钱的次数多，此时以开房天数来算，
//否则，就把水果卖了换钱，再用钱除以水果加房钱总和
public class IndispensableXiaoYi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            long x = scanner.nextInt();
            long f = scanner.nextInt();
            long d = scanner.nextInt();
            long p = scanner.nextInt();
            long day = 0;

            if (f > d / x){
                day = d / x;
            }else {
                d = d + f * p;
                day = d / (x + p);
            }
            System.out.println(day);
        }
    }
}
