package dailyOneprobleme;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PingPangKuang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            Map<Character,Integer> map=new HashMap<>();
            String[]str=new String[2];
            str=sc.nextLine().split(" ");
            String searh = searh(str, map);
            System.out.println(searh);
        }

    }

    private static String searh(String[] str,Map<Character,Integer> map) {
        for (int i = 0; i <str[0].length() ; i++) {
            if (map.containsKey(str[0].charAt(i))){
                map.put(str[0].charAt(i),map.get(str[0].charAt(i))+1);
            }else {
                map.put(str[0].charAt(i),1);
            }
        }
        for (int i = 0; i <str[1].length() ; i++) {
            if (map.containsKey(str[1].charAt(i))){
                map.put(str[1].charAt(i),map.get(str[1].charAt(i))-1);
            }else {
                return "No";
            }
        }
        for (int i = 0; i <str[0].length() ; i++) {

            if (map.get(str[0].charAt(i))<0){
                return "No";
            }
        }
        return "Yes";
    }
}
