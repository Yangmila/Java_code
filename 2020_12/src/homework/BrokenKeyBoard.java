package homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BrokenKeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String expected = scanner.next();
            String actual = scanner.next();
            expected = expected.toUpperCase();
            actual = actual.toUpperCase();

            Set<Character> actualSet = new HashSet<>();
            for(int i = 0;i < actual.length();i++){
                actualSet.add(actual.charAt(i));
            }

            Set<Character> brokenSet = new HashSet<>();
            for(int i = 0;i < expected.length();i++){
                char c = expected.charAt(i);
                if(actualSet.contains(c)){
                    continue;
                }
                if(brokenSet.contains(c)){
                    continue;
                }
                System.out.print(c);
                brokenSet.add(c);
            }
            System.out.println();
        }
    }
}
