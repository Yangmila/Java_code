package practice;

import java.util.Scanner;
//解救小易
public class XiaoYiJieJiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] _1 = new int[sc.nextInt()];
        for(int i = 0; i < _1.length; i++){
            _1[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i : _1) {
            min = Math.min(min, i + sc.nextInt());
        }
        System.out.println(min - 2);
    }
}
