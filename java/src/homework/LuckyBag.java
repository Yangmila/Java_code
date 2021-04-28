package homework;
//幸运的袋子

import java.util.Arrays;
import java.util.Scanner;

public class LuckyBag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for(int i = 0;i < num;i++){
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(methods(arr,0,0,1));
        }
    }

    public static int methods(int[] arr,int index, long sum, long mult) {
        int count = 0;
        for(int i = index;i < arr.length;i++){
            sum += arr[i];
            mult *= arr[i];
            if(sum > mult){
                count += 1 + methods(arr,i + 1,sum,mult);
            }else if(arr[i] == 1){
                count += methods(arr,i + 1,sum,mult);
            }else {
                break;
            }
            sum -= arr[i];
            mult /= arr[i];
            while (i < arr.length - 1 && arr[i] == arr[i + 1]){
                i++;
            }
        }
        return count;
    }
}
