package homework;
//炮台距离

import java.util.Scanner;

public class PaoTaiJuLi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int r = scanner.nextInt();
            int[] tar1 = new int[2];
            int[] tar2 = new int[2];
            int[] tar3 = new int[2];
            int[] tar = new int[2];

            tar1[0] = scanner.nextInt();
            tar1[1] = scanner.nextInt();
            tar2[0] = scanner.nextInt();
            tar2[1] = scanner.nextInt();
            tar3[0] = scanner.nextInt();
            tar3[1] = scanner.nextInt();
            tar[0] = scanner.nextInt();
            tar[1] = scanner.nextInt();

            int ret = 0;
            ret += dist(r,tar1,tar);
            ret += dist(r,tar2,tar);
            ret += dist(r,tar3,tar);
            System.out.println(ret + "x");
        }
    }

    public static int dist(int r,int[] tar1,int[] tar){
        double dis = Math.sqrt(Math.pow((tar1[0] - tar[0]),2) + Math.pow((tar1[1] - tar[1]),2));
        return dis > r ? 0 : 1;
    }
}
