package homework;

public class MaxsumofSubarray {
    public int maxsumofSubarray (int[] arr) {
        if(arr.length == 0){
            return 0;
        }

        int sum = arr[0];
        int max = sum;

        for(int i = 1;i < arr.length;i++){
            if(sum > 0){
                sum = sum + arr[i];
            }else{
                sum = arr[i];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
