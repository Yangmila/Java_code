package homework;
//杨辉三角的变形
import java.util.Scanner;

public class YangHuiSanJiao {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            if(n<=2)
                System.out.println(-1);
            else if(n%2==1)
                System.out.println(2);
            else if(n%4==0)
                System.out.println(3);
            else
                System.out.println(4);
        }
        in.close();
    }
}
