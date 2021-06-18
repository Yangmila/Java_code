package practice;
//访友
//小易准备去拜访他的朋友，他的家在0点，但是他的朋友的家在x点(x > 0)，均在一条坐标轴上。
// 小易每一次可以向前走1，2，3，4或者5步。问小易最少走多少次可以到达他的朋友的家。
import java.util.Scanner;

public class VisitFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            int step = 0;
            if (x > 5){
                if (x % 5 != 0){
                    step = x / 5 + 1;
                }else {
                    step = x / 5;
                }
            }else {
                step = 1;
            }
            System.out.println(step);
        }
    }
}
