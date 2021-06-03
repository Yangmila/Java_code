package practice;

import java.util.Scanner;
//藏宝图
//牛牛拿到了一个藏宝图，顺着藏宝图的指示，牛牛发现了一个藏宝盒，
// 藏宝盒上有一个机关，机关每次会显示两个字符串 s 和 t，
// 根据古老的传说，牛牛需要每次都回答 t 是否是 s 的子序列。
// 注意，子序列不要求在原字符串中是连续的，例如串 abc，它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种。
public class CangBaoTu {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String t = scanner.nextLine();
            int i = 0 ;
            int j = 0;
            while(i < s.length()){
                if(j >= t.length()){
                    break;
                }
                if(s.charAt(i) == t.charAt(j)){
                    if(j == t.length() - 1){
                        System.out.println("Yes");
                        return;
                    }
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
        }
        System.out.println("No");
    }
}
