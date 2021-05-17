package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class XingJiMiMa {
    public static int[] resArr = new int[10001];
    static{
        resArr[0] = 1;
        resArr[1] = 1;
        for (int i = 2; i < 10001; i++) {
            resArr[i] = (resArr[i-1] + resArr[i-2]) % 10000;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0000");
        while(scan.hasNext()){
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                int numF = resArr[num];
                System.out.print(df.format(numF));
            }
            System.out.println();
        }
    }
}
