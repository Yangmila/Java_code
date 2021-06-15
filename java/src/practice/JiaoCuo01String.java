package practice;
//交错01串
//如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。
// 例如: "1","10101","0101010"都是交错01串。
//小易现在有一个01串s,小易想找出一个最长的连续子串,并且这个子串是一个交错01串。
// 小易需要你帮帮忙求出最长的这样的子串的长度是多少。
import java.util.Scanner;
//遍历一遍数组记录最长的01交错子串长度就完了
public class JiaoCuo01String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            int maxLen = 1;
            int len = 1;
            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(i - 1) != str.charAt(i)){
                    len++;
                    if (len > maxLen){
                        maxLen = len;
                    }
                }else {
                    len = 1;
                }
            }
            System.out.println(maxLen);
        }
    }
}
