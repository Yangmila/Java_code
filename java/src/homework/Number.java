package homework;

import java.util.Scanner;

public class Number {
    public static void print(int n){
        if (n <= 9)
        {
            System.out.print(n+" ");
        }
        else
        {
            print(n / 10);
            System.out.print(n % 10+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        print(num);
    }
}
