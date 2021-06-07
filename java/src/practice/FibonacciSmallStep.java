package practice;
//Fibonacci数列
import java.util.Scanner;

//给你一个N，你想让其变为一个Fibonacci数，
// 每一步你可以把当前数字X变为X-1或者X+1，
// 现在给你一个数N求最少需要多少步可以变为Fibonacci数。
public class FibonacciSmallStep {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(step(num));
        }
    }

    public static int step(int num){
        int f0 = 0;
        int f1 = 1;
        int f;
        int left = 0;
        int right = 0;

        while(true){
            f = f0 + f1;
            f0 = f1;
            f1 = f;

            if(f < num){
                left = num - f;
            }else{
                right = f - num;
                break;
            }
        }
        return Math.min(left,right);
    }
}
