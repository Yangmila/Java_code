package homework;

public class Sum {
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int n1=2;
        int n2=8;
        double n3=2.3,n4=7.2,n5=8.9;
        int ret1=sum(n1,n2);
        double ret2=sum(n5,n3,n4);
        System.out.println(n1+"+"+n2+"="+ret1);
        System.out.println(n3+"+"+n4+"+"+n5+"="+ret2);
    }
}
