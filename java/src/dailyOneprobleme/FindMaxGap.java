package dailyOneprobleme;

public class FindMaxGap {
    public int findMaxGap(int[] A, int n) {
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            int tmp = Math.abs(getMax(A,0,i) - getMax(A,i+1,n-1));
            result = tmp > result ? tmp : result;
        }
        return result;
    }
    int getMax(int[] A, int start, int end) {
        int max = A[end];
        for (int i = start; i < end; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
}
