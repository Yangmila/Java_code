package homework;

public class digSum {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        int ret = sum(n);
        System.out.println(ret);
    }
}
