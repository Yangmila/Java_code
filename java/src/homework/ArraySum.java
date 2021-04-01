package homework;

public class ArraySum {
    public static int sum(int[] arr){
        int sum=0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={2,45,6,3,7,35,78,32};
        System.out.println(sum(arr));
    }
}
