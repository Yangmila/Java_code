package homework;

//求正数数组的最小不可组成和
import java.util.Arrays;

public class GetFirstUnFormedNum {
    public int getFirstUnFormedNum(int[] arr) {
        if(arr == null || arr.length <= 0 ){
            return 1;
        }

        Arrays.sort(arr);
        int min = arr[0];
        int max = 0;
        for (int i = 0;i < arr.length;i++){
            max += arr[i];
        }

        boolean[] dp = new boolean[max + 1];
        dp[0] = true;
        for(int i = 0;i != arr.length;i++){
            for (int j = max;j >= arr[i];j--){
                dp[j] = dp[j - arr[i]] ? true : dp[j];
            }
        }
        for (int i = min;i != dp.length;i++){
            if(!dp[i]){
                return i;
            }
        }
        return max + 1;
    }
}
