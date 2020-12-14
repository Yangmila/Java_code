package homework;

public class Prime {
    public static void main(String[] args) {
        int i,j;
        for(i=2;i<=100;++i){
            for(j=2;j<=(int)Math.sqrt(i);++j){
                if(i%j==0) {
                    break;
                }
            }
            if(j>(int)Math.sqrt(i)){
                System.out.print(i+" ");
            }
        }
    }
}
