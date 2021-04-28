package homework;

public class FindMinimum {
    public int findMinimum(int n, int[] left, int[] right) {
        int leftSum = 0, rightSum = 0;
        int leftMin = Integer.MAX_VALUE, rightMin = Integer.MAX_VALUE;
        int complete = 0;
        for(int i = 0; i < n; i++)
        {
            if(left[i] * right[i] == 0)
                complete += (left[i] + right[i]);
            else
            {
                leftSum += left[i];
                rightSum += right[i];
                leftMin = Math.min(leftMin, left[i]);
                rightMin = Math.min(rightMin, right[i]);
            }
        }
        return complete + Math.min(leftSum - leftMin + 1, rightSum - rightMin + 1) + 1;
    }
}
