package practice;
//左旋转字符串
//汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
// 对于一个给定的字符序列 S，请你把其循环左移 K 位后的序列输出（保证 K 小于等于 S 的长度）。
// 例如，字符序列S=”abcXYZdef”,要求输出循环左移 3 位后的结果，即“XYZdefabc”。
public class LeftRotateString {
    //方法一：用原理来解决
    public String LeftRotateString1(String str,int n) {
        char[] chars = str.toCharArray();
        if(chars.length < n) {
            return "";
        }
        reverse(chars, 0, n-1);
        reverse(chars, n, chars.length-1);
        reverse(chars, 0, chars.length-1);
        StringBuilder sb = new StringBuilder(chars.length);
        for(char c:chars){
            sb.append(c);
        }
        return sb.toString();
    }

    public void reverse(char[] chars,int low,int high){
        char temp;
        while(low<high){
            temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }
    //方法二：使用API
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() <= 1){
            return str;
        }
        n = n % str.length();
        return str.substring(n) + str.substring(0,n);
    }
}
