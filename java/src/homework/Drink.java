package homework;

import java.util.Scanner;

//喝汽水
public class Drink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            if(num != 0){
                System.out.println(drink(num));
            }
        }
    }

    public static int drink(int num){
        int total = 0;
        while(num > 2){
            total = total + num / 3;
            num = num / 3 + num % 3;
        }

        if(num == 2){
            total = total + 1;
        }
        return total;
    }
}
