package homework;

public class FindNum {
    //从0,1,2,...,n这n+1个数中选择n个数，找出这n个数中缺失的那个数，要求O(n)尽可能小。
    public int solve (int[] a) {
        int right = a.length;
        int sum = 0;
        int rightSum = 0;

        for(int i = 0;i < a.length;i++){
            sum += a[i];
        }
        while(right >= 0){
            rightSum += right;
            right--;
        }
        return rightSum - sum;
    }
}
