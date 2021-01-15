package homework;

public class Max {
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static double max(double a,double b,int c){
        double max = 0;
        if(a > b){
            max = a;
        }
        else max = b;
        if(max > c){
            return max;
        }
        else
            return c;
    }
    public static void main(String[] args) {
        int n1 = 5,n2 = 7;
        double n3 = 3.23,n4 = 7.56;
        System.out.println(max(n1,n2));
        System.out.println(max(n4,n3));
        System.out.println(max(n4,n3,n1));
    }
}
