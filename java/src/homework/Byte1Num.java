package homework;
//求最大连续bit数
import java.util.Scanner;

public class Byte1Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            String str = Integer.toBinaryString(num);
            String[] strings = str.split("0");
            int count = 0;

            for(String string : strings){
                count = Math.max(count,string.length());
            }
            System.out.println(count);
        }
    }
}
