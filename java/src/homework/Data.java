package homework;
//计算日期到天数转换

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();

            System.out.println(getOutDay(year,month,day));
        }
    }

    public static int getOutDay(int year, int month, int day) {
        int sum = 0;
        int[] arr = {0,31,59,90,120,151,181,212,243,273,304,334};
        boolean isDayOk = checkDay(month,day);
        if(isLoopYear(year) && month > 2& isDayOk){
            sum = arr[month - 1] + day + 1;
        }else if(isDayOk){
            sum = arr[month - 1] + day;
        }else {
            sum = -1;
        }
        return sum;
    }

    public static boolean isLoopYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        return false;
    }

    public static boolean checkDay(int month, int day) {
        int[] a = {0,31,59,90,120,151,181,212,243,273,304,334,365};
        if(day > 0 && day <= a[month] - a[month - 1]){
            return true;
        }
        return false;
    }
}
