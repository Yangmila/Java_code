package homework;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int[] B = {2,5,6};
        merge(A,A.length,B,B.length);
    }
    public static void merge(int A[], int m, int B[], int n) {
        if(A == null || B == null){
            return;
        }

        int k = m;
        for(int j = 0;j<n;j++){
            A[k++] = B[j];
        }
        Arrays.sort(A);
        for(int i = 0;i < A.length;i++){
            System.out.print(A[i]);
        }
        return;
    }
}
