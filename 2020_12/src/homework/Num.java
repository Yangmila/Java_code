package homework;
public class Num {
    public static void main(String[] args) {
        int count=0;

        for(int i=1;i<=100;++i){
            if (i % 10 == 9) {
                count++;
               }if (i / 10 == 9){
                count++;
                 }
        }
        System.out.println("1到 100 的所有整数中出现"+count+"个数字9.");
    }
}
