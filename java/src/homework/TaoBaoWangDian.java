package homework;
//淘宝网店
import java.util.Scanner;

public class TaoBaoWangDian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int year1 = scanner.nextInt();
            int month1 = scanner.nextInt();
            int day1 = scanner.nextInt();
            int year2 = scanner.nextInt();
            int month2 = scanner.nextInt();
            int day2 = scanner.nextInt();
            int count = 0;

            count += FullYear(year1) - DaysYear(year1,month1,day1 - 1);
            count += DaysYear(year2,month2,day2);
            if(year1 == year2){
                count -= FullYear(year1);
            }
            for(int i = year1 + 1;i < year2;i++){
                count += FullYear(i);
            }
            System.out.println(count);
        }
    }

    // 求解当日为一年第几天
    public static int DaysYear(int year, int month, int day) {
        if (!suMonth(month))
            day *= 2;
        while (-- month > 0) {
            switch(month) {   //偶数31天
                case 1:
                case 8:
                case 10:
                case 12:
                    day += 62;
                    break;
                case 3:        //奇数31天
                case 5:
                case 7:
                    day += 31;
                    break;
                case 4:            //偶数30天
                case 6:
                case 9:
                    day += 60;
                    break;
                case 11:             //奇数30天
                    day += 30;
                    break;
                case 2:             //2月单独看
                    day += 28 + leapYear(year);
                    break;
                default:;
            }
        }
        return day;
    }

    // 判断该月是否为素数月
    public static boolean suMonth(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7 || n == 11;
    }

    // 闰年判断，是闰年返回1，不是返回0
    public static int leapYear(int year) {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return 1;
        }
        return 0;
    }

    // 足年天数
    public static int FullYear(int year) {
        return 2 * 31 + 1 * 28 + 1 * 31 + 2 * 30 + 1 * 31 + 2 * 30 + 1 * 31
                + 2 * 31 + 2 * 30 + 2 * 31 + 1 * 30 + 2 * 31 + leapYear(year);
    }
}
