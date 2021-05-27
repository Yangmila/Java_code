package dailyOneprobleme;

import java.util.Scanner;

//养兔子
public class YangRabbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int day = scanner.nextInt();
            if(day < 4){
                System.out.println(day);
            }else {
                long num0 = 2;
                long num1 = 3;
                long num = 0;
                for(int i = 4;i <= day;i++){
                    num = num0 + num1;
                    num0 = num1;
                    num1 = num;
                }
                System.out.println(num);
            }
        }
    }
}
