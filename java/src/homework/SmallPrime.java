package homework;
//查找组成一个偶数最接近的两个素数

import java.util.Scanner;

public class SmallPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int mid = num / 2;
            int i;

            for(i = mid;i > 0;i--){
                if(isPrime(i) && isPrime(num - i)){
                    break;
                }
            }
            System.out.println(i + " " + (num - i));
        }
    }

    private static boolean isPrime(int num) {
        for(int i = 2;i < num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
