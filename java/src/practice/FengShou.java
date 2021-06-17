package practice;
//丰收
//在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。

import java.util.Arrays;
import java.util.Scanner;

public class FengShou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();

            int a = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int input = scanner.nextInt();
                arr[i] = a + input;
                a = arr[i];
            }
            int m = scanner.nextInt();
            int[] q = new int[m];
            for (int i = 0; i < m; i++) {
                q[i] = scanner.nextInt();
            }

            //二分查找
            for (int i = 0; i < m; i++) {
                int index = Arrays.binarySearch(arr,q[i]);
                if (index > 0){
                    System.out.println(index + 1);
                }else {
                    System.out.println(-index);
                }
            }
        }
    }
}
