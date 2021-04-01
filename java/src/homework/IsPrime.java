package homework;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int i;

        for(i=2;i<=(int)Math.sqrt(num);++i)
        {
            if(num%i==0)
                break;
        }
        if(i>(int)Math.sqrt(num)){
            System.out.println(num+"是素数.");
        }
        else{
            System.out.println(num+"不是素数.");
        }
    }
}
