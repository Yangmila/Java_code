package practice;
//构建乘积数组
//给定一个数组A[0,1,...,n-1]
//请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
//（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
public class Multiply {
    //假设：
    //left[i] = A[0]*...*A[i-1]
    //right[i] = A[i+1]*...*A[n-1]
    //所以：
    //B[i] = left[i] * right[i]
    //可知：
    //left[i+1] = A[0]*...A[i-1]*A[i]
    //right[i+1] = A[i+2]*...*A[n-1]
    //
    //于是，
    //left[i+1] = left[i] * A[i]
    //right[i] = right[i+1] * A[i+1]
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length != 0 ){
            B[0] = 1;
            //计算下三角连乘
            for(int i = 1; i < length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            //计算上三角
            for(int j = length-2; j >= 0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
}
