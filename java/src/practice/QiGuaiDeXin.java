package practice;
//一封奇怪的信
//现在你需要用一台奇怪的打字机书写一封书信。信的每行只能容纳宽度为100的字符，也就是说如果写下某个字符会导致行宽超过100，那么就要另起一行书写
//信的内容由a-z的26个小写字母构成，而每个字母的宽度均会事先约定。例如字符宽度约定为[1,2,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5]，那么就代表'a'到'd'四个字母的宽度分别是1,2,3,4，而'e'到'z'的宽度均为5
//那么按照上述规则将给定内容S书写成一封信后，这封信共有几行？最后一行宽度是多少？
import java.util.Scanner;
/*
首先用一个长度为26的整型数组保存每个单词的长度；
当需要知道某个单词的长度时，只需要用该字符减去97，然后将差值作为下标即可
然后以100进行统计，当加上需要添加的字符使得总和大于100，则不添加，否则继续
*/
public class QiGuaiDeXin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int[] width = new int[26];
            for (int i = 0; i < 26; i++) {
                width[i] = scanner.nextInt();
            }
            String str = scanner.next();
            char[] ch = str.toCharArray();

            int count = 1;//行数
            int sum = 0;//字符的总数
            int lastSum = 0;//最后一行的和
            for (int i = 0; i < ch.length; ) {
                int chlength = width[ch[i] - 97];
                if (sum + chlength <= 100){
                    sum += chlength;
                    lastSum = sum;
                    i++;//把这个放在这里的目的是，为了确保在刚好要超过100的那个字符能参与到下一行的计算
                }else {
                    count++;
                    sum = 0;
                }
            }
            System.out.println(count + " " + lastSum);
        }
    }
}
