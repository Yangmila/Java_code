package homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        while (scanner.hasNext()) {
            set.add(scanner.next());
        }
        int num = set.size();
        System.out.println(num);
    }
}
