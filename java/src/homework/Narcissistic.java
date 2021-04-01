package homework;

public class Narcissistic {
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            if (isNarcissisticNum(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isNarcissisticNum(int num) {
        int ge = num % 10;
        int tmp = num / 10;
        int shi = tmp % 10;
        tmp = num / 100;
        int bai = tmp % 10;

        if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == num) {
            return true;
        }
        return false;
    }
}

