package homework;
//字符串反转
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String s1=scanner.nextLine();
            reverse(s1);
        }
    }
    public static void reverse(String a){
        StringBuffer str = new StringBuffer();
        String[] ans = a.split(" ");
        for(int i = ans.length - 1;i >= 0;i--){
            str.append(ans[i]);
            str.append(" ");
        }
        System.out.println(str.toString());
    }

//    public static String reverse (String str) {
//        char[] ans = str.toCharArray();
//        String reverse = "";
//        for (int i = ans.length - 1; i >= 0; i--) {
//            reverse += ans[i];
//        }
//        return reverse;
//    }
}
