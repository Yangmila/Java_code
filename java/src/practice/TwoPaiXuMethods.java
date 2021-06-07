package practice;

import java.util.Scanner;
//两种排序方法
//考拉有n个字符串字符串，任意两个字符串长度都是不同的。考拉最近学习到有两种字符串的排序方法： 1.根据字符串的字典序排序。例如：
//"car" < "carriage" < "cats" < "doggies < "koala"
//2.根据字符串的长度排序。例如：
//"car" < "cats" < "koala" < "doggies" < "carriage"
//考拉想知道自己的这些字符串排列顺序是否满足这两种排序方法，考拉要忙着吃树叶，所以需要你来帮忙验证。
public class TwoPaiXuMethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            String[] words = new String[n];
            for(int i = 0;i < n;i++){
                words[i] = scanner.next();
            }
            System.out.println(val(words));
        }
    }

    public static String val(String[] words){
        boolean isABC = isAbc(words);
        boolean isLEN = isLen(words);
        if(isABC && isLEN){
            return "both";
        }else if(isABC){
            return "lexicographically";
        }else if(isLEN){
            return "lengths";
        }
        return "none";
    }

    public static boolean isAbc(String[] words){
        boolean ret = true;
        for(int i = 1;i < words.length;i++){
            if(words[i].compareTo(words[i - 1]) <= 0){
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static boolean isLen(String[] words){
        boolean ret = true;
        for(int i = 1;i < words.length;i++){
            if(words[i].length() < words[i - 1].length()){
                ret = false;
                break;
            }
        }
        return ret;
    }
}
