package homework;

import java.util.Scanner;

//有假币
public class JiaBi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int weight = scanner.nextInt();
            num(weight);
        }
    }

    public static void num(int weight) {
        if(weight == 0){
            return;
        }
        int count = 0;
        while (weight >= 2){
            if (weight % 3 != 0){
                weight = weight / 3 + 1;
            }else {
                weight = weight / 3;
            }
            count++;
        }
        System.out.println(count);
    }
}
