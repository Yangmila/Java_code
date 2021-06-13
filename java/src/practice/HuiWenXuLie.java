package practice;
//回文序列
//现在给出一个数字序列，允许使用一种转换操作：
//选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
//现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。
import java.util.Scanner;
//比较第一个和最后一个数，如果第一个大，则前两个相加替换原来位置。
//如果最后一个数大，则最后两个相加替换原来位置。
//如果首尾元素相等，则跳过首尾元素。
public class HuiWenXuLie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(dealHuiWen(arr,n));
        }
    }

    public static int dealHuiWen(int[] arr, int n) {
        int count = 0;
        int i = 0;
        int j = n - 1;

        while (i < j){
            if(arr[i] < arr[j]){
                arr[i + 1] += arr[i];
                i++;
                count++;
            }else if(arr[i] > arr[j]){
                arr[j - 1] += arr[j];
                j--;
                count++;
            }else {
                i++;
                j--;
            }
        }
        return count;
    }
}
