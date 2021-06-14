package practice;
//计算糖果
//A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
//现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。
import java.util.Scanner;

public class Suger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int n4 = scanner.nextInt();
            double ret1,ret2,ret3;

            ret1 = (n1 + n3) / 2;
            ret2 = (n3 - n1) / 2;
            ret3 = (n4 - n2) / 2;

            if((ret1 - ((n1 + n3) / 2)) != 0){
                System.out.println("No");
                return;
            }
            if((ret2 - ((n3 - n1) / 2) != 0) || (ret2 != ((n2 + n4) / 2))){
                System.out.println("No");
                return;
            }
            if ((ret3 - ((n4 - n2) / 2)) != 0){
                System.out.println("No");
                return;
            }
            System.out.print((int)ret1 + " " + (int)ret2 + " " + (int)ret3);
        }
    }
}
