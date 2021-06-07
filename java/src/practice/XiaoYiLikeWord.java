package practice;

import java.util.Scanner;
//小易喜欢的单词具有以下特性：
//1.单词每个字母都是大写字母
//2.单词没有连续相等的字母
//3.单词没有形如“xyxy”(这里的x，y指的都是字母，并且可以相同)这样的子序列，子序列可能不连续。
public class XiaoYiLikeWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.next();
            System.out.println(isLike(str));
        }
    }

    public static String isLike(String str){
        String ret = "Dislikes";
        if(str == null || str == ""){
            return ret;
        }
        for(int i = 0;i < str.length() - 1;i++){
            if(!Character.isUpperCase(str.charAt(i))){
                return ret;
            }
        }
        for(int i = 0;i < str.length() - 1;i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                return ret;
            }
        }
        for(int i = 0;i < str.length() - 3;i++){
            if(str.charAt(i) == str.charAt(i + 2) && str.charAt(i + 1) == str.charAt(i + 3)){
                return ret;
            }
        }
        return "Likes";
    }
}
