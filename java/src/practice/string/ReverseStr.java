package practice.string;
//反转字符串 II
//给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
//
//如果剩余字符少于 k 个，则将剩余字符全部反转。
//如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
public class ReverseStr {
    //题目的意思其实概括为 每隔2k个反转前k个，尾数不够k个时候全部反转
    //在遍历字符串的过程中，只要让 i += (2 * k)，i 每次移动 2 * k 就可以了，然后判断是否需要有反转的区间。
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        char tmp;
        for(int i = 0;i < c.length;i += 2 * k){
            int start = i;
            //这里是判断尾数够不够k个来取决end指针的位置
            int end = Math.min(c.length - 1,start + k - 1);
            //用异或运算反转
            while(start < end){
                tmp = c[start];
                c[start] = c[end];
                c[end] = tmp;
                start++;
                end--;
            }
        }
        return new String(c);
    }
}
