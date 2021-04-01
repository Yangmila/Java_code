package homework;

import java.util.Scanner;

public class Divisor {
    public static int div(int num1,int num2){
        int tmp,ret;
        if(num1<num2){
            tmp=num1;
            num1=num2;
            num2=tmp;
        }
        ret=num1%num2;
        while(ret!=0)
        {
            num1=num2;
            num2=ret;
            ret=num1%num2;
        }
        return num2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        int ret=div(num1,num2);

        System.out.println("最大公约数:"+ret);

    }
}
