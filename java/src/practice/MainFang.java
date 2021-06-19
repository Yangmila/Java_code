package practice;
//买房
//在一条街上有n幢房子，标号从1到n，两个在标号上相差为1的房子视为相邻，这些房子中有k幢房子已有住户。
//现你准备搬入这条街，你能搬入一幢房子的条件是这幢房子没有人住在里面，与此同时由于你非常热爱与邻居进行交流，故而你需要你所入住的房子两边上都有住户。
//现要你求最小的可能符合要求的房子数，以及最大的可能符合要求的房子数。
import java.util.Scanner;
//可以让已经入住的邻居全部紧密排列在一起，所以最少的情况一定是0。
//而最多的就是题干中举出的相间情况，为k户已入住人家的内间隔数，即k-1，
//但k-1又不能比剩下的位置n-k大，所以最大只能是n-k和k-1中小的那个。
public class MainFang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (n < 3) {
                System.out.println(0 + " " + 0);
            } else {
                if (n - k < k) {
                    System.out.println(0 + " " + (n - k));
                } else {
                    System.out.println(0 + " " + (k - 1 > 0 ? k - 1 : 0));
                }
            }
        }
    }
}
