package homework;

public class Avg {
    public static double avg(int []arr){
        int sum=0;
        double ret;
        for(int i:arr) {
            sum += i;
        }
        ret = sum/arr.length;
        return ret;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,5,6,9,66,45};
        System.out.println(avg(arr));
    }
}
