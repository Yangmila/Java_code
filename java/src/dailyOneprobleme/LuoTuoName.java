package dailyOneprobleme;

import java.util.Scanner;

public class LuoTuoName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            String[] words = str.split("_");
            String ret = words[0];
            for (int i = 1; i < words.length; i++) {
                ret += (char)(words[i].charAt(0) - 'a' + 'A');
                for (int j = 1; j < words[i].length(); j++) {
                    ret += words[i].charAt(j);
                }
            }
            System.out.println(ret);
        }
    }

    private static void getName(String s) {
        char[] c=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <c.length ; i++) {
            if (c[i]=='_'){
                sb.append(Character.toUpperCase(c[i+1]));
                i++;
            }else {
                sb.append(c[i]);
            }

        }
        System.out.println(sb.toString());

    }
}
