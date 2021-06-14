package practice;
//彩色的砖块
//现在有一个给定的字符串s,s中每个字符代表小易的某个砖块的颜色。
// 小易想把他所有的砖块排成一行。如果最多存在一对不同颜色的相邻砖块,那么这行砖块就很漂亮的。
// 请你帮助小易计算有多少种方式将他所有砖块排成漂亮的一行。(如果两种方式所对应的砖块颜色序列是相同的,那么认为这两种方式是一样的。)
//例如: s = "ABAB",那么小易有六种排列的结果:
//"AABB","ABAB","ABBA","BAAB","BABA","BBAA"
//其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。
import java.util.HashSet;
import java.util.Scanner;
//思想就是看字符串里有几种字符，超过两种就不可能只有一对相邻的不同字符，
//有两种字符就是两种正确的排列，有一种字符自然就是一种正确的排列。
public class ColorfulZhuanKuai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            HashSet<String> set = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.substring(i,i + 1));
                if (set.size() > 2){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(set.size());
        }
    }
}
