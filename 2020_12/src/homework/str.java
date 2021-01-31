package homework;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuffer str1 = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String tmp = str1.toString();
                if (!tmp.contains(ch + "")) {
                    str1.append(ch);
                }
            }
            System.out.println(str1);
        }
    }
}
