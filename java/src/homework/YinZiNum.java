package homework;

import java.util.Scanner;

//因子个数
public class YinZiNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int count = 0;
            for(int i = 2;i <= Math.sqrt(n);i++){
                if(n % i == 0){
                    while (n % i == 0){
                        n /= i;
                    }
                    count++;
                }
            }
            if(n != 1){
                count++;
            }
            System.out.println(count);
        }
    }
}
