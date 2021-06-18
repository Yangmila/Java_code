package practice;
//表达式求值
//今天上课，老师教了小易怎么计算加法和乘法，乘法的优先级大于加法，但是如果一个运算加了括号，那么它的优先级是最高的。例如：
//1+2*3=7
//1*(2+3)=5
//1*2*3=6
//(1+2)*3=9
//现在小易希望你帮他计算给定3个数a，b，c，在它们中间添加"+"， "*"， "("， ")"符号，能够获得的最大值。
import java.util.Arrays;
import java.util.Scanner;

public class BiaoDaShiQiuZhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int[] d = new int[4];
            d[0] = a + b + c;
            d[1] = (a + b) * c;
            d[2] = a + (b + c);
            d[3] = a * b * c;

            Arrays.sort(d);

            System.out.println(d[3]);
        }
    }
}
