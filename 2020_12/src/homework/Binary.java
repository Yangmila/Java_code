package homework;

import java.util.Scanner;

public class Binary {
    public static int num(int m){
        int ret;
        int i=31;
        int count=0;

        while (i>=0)
        {
            ret=(m >> i) & 1;
            if(ret==1)
            {
                count++;
            }
            i--;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();

        int i = 31;

        System.out.println("二进制：");
        while (i>=0)
        {
            System.out.print(((m >> i) & 1)+" ");
            i--;
        }
        System.out.println();

        int ret=num(m);

        System.out.println("二进制中 1 的个数为："+ret);
    }
}
