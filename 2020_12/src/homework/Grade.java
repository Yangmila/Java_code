package homework;

public class Grade {
    public static void main(String[] args) {
        double sum=0;
        for(double i=1;i<=100;++i){
            sum+=(1/i)*Math.pow(-1,i);
        }
        System.out.println("分数的值:"+sum);
    }
}
