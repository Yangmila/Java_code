package homework;
//数根
import java.util.Scanner;

public class NumGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            int num = scanner.nextInt();
            numGen(num);
        }
    }

    public static void numGen(int num) {
        int sum = 0;
        while (num > 0){
            int x = num %10;
            sum += x;
            num /= 10;
        }
        if(sum >= 10){
            numGen(sum);
        }else {
            System.out.println(sum);
        }
        return;
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while(input.hasNext()){
//            String a=input.next();
//            int num;
//            do{
//                num=0;
//                for(int i=0;i<a.length();i++){
//                    num+=a.charAt(i)-48;
//                }
//                a=num+"";
//            }while(num>=10);
//            System.out.println(num);
//        }
//        input.close();
//    }
//}

