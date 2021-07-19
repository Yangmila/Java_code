package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//链接：https://www.nowcoder.com/questionTerminal/f88dafac00c8431fa363cd85a37c2d5e
//来源：牛客网
//
//旧键盘 (20)
//旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
//肯定坏掉的那些键。
public class BrokenKeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 预期要输出的. 比较长, 比较全
            String expected = scanner.next();
            // 实际输出的. 比较短, 有残缺
            String actual = scanner.next();
            // 转成大写
            expected = expected.toUpperCase();
            actual = actual.toUpperCase();
            // 核心操作是要找出 expected 中哪些字符在 actual 中不存在~
            // 于是就先把 actual 中的字符都放到一个 set 中
            Set<Character> actualSet = new HashSet<>();
            for (int i = 0; i < actual.length(); i++) {
                actualSet.add(actual.charAt(i));
            }
            // 遍历 expected 字符串, 依次判定当前字符是否在 actualSet 中出现过
            // 题目要求, 坏键不能打印多次.
            // 就需要使用另外一个 set 来记录当前已经发现了多少坏键
            // 如果发现某个键坏了, 先去这个 set 查一下. 如果不存在才打印
            // 如果已经存在, 也直接跳过
            Set<Character> brokenSet = new HashSet<>();
            for (int i = 0; i < expected.length(); i++) {
                char c = expected.charAt(i);
                if (actualSet.contains(c)) {
                    // 如果 c 存在, 说明该按键是好的
                    continue;
                }
                // 该键坏了~~
                // 先判定这个坏键之前有没有出现过
                if (brokenSet.contains(c)) {
                    continue;
                }
                // 这个坏键前面不存在, 可以打印
                System.out.print(c);
                brokenSet.add(c);
            }
            // 不要忘记换行, 否则可能导致多组用例的结果ran在同一行了
            System.out.println();
        }  // end while
    }  // end main
}
