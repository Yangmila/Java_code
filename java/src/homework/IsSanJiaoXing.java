package homework;

import java.math.BigInteger;
import java.util.Scanner;

public class IsSanJiaoXing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();
            if(a.add(b).compareTo(c) > 0 && a.add(c).compareTo(b) > 0 && b.add(c).compareTo(a) > 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
