package homework;

public class Max1 {
    public static double max2(double a,double b){
        return a>b?a:b;
    }
    public static double max3(double a,double b,double c){
        double ret1 = max2(a,b);
        double ret2 = max2(ret1,c);
        return ret2;
    }
    public static void main(String[] args) {
        double n1 = 12.2,n2=4.3,n3=5.3;
        System.out.println(max3(n1,n2,n3));
    }
}
