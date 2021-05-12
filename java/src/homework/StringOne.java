package homework;

import java.util.HashMap;
import java.util.Scanner;

//找出字符串中第一个只出现一次的字符
public class StringOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            stringOne(str);
        }
    }

//    public static void stringOne(String str) {
//        for(int i = 0;i < str.length();i++){
//            String tmp = str.substring(0,i) + str.substring(i + 1);
//            String c = String.valueOf(str.charAt(i));
//            if(tmp.contains(c)){
//                continue;
//            }else {
//                System.out.println(c);
//            }
//            System.out.println(-1);
//        }
//    }

//    public static void stringOne(String str) {
//        if (str == null || str.length() == 0) {
//            System.out.println(-1);
//        }
//        for(int i = 0;i < str.length();i++){
//            String tmp = str.substring(0,i) + str.substring(i + 1);
//            int index = tmp.indexOf(str.charAt(i));
//            if(index == -1){
//                String c = String.valueOf(str.charAt(i));
//                System.out.println(c);
//                break;
//            }
//        }
//    }

    //用哈希表的方式用来统计字符出现的字数，时间复杂度O(n)
    public static void stringOne(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))){
                int value = hashMap.get(str.charAt(i));
                hashMap.put(str.charAt(i), value+1);
            }else {
                hashMap.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
