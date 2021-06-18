package practice;
//代价
//你有3个需要完成的任务，完成这3个任务是需要付出代价的。
//首先，你可以不花任何代价的完成一个任务；然后，在完成了第i个任务之后，你可以花费|Ai - Aj|的代价完成第j个任务。|x|代表x的绝对值。
//计算出完成所有任务的最小代价。
import java.util.Arrays;
import java.util.Scanner;

public class DaiJia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int min = (arr[1] - arr[0]) + (arr[2] - arr[1]);
            System.out.println(min);
        }
    }
}
