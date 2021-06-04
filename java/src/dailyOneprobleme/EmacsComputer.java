package dailyOneprobleme;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Emacs计算器
public class EmacsComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            String[] suffix = new String[num];

            for (int i = 0; i < num; i++) {
                suffix[i] = scanner.next();
            }
            System.out.println(calculate(suffix));
        }
    }

    private static int calculate(String[] suffix) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : suffix) {
            char c = s.charAt(0);
            if (s.length() == 1 && (c == '+' || c == '-' || c == '*' || c == '/')) {
                int b = stack.removeFirst();
                int a = stack.removeFirst();
                stack.addFirst(calculate(a, b, c));
            } else {
                stack.addFirst(Integer.parseInt(s));
            }
        }
        return stack.removeFirst();
    }

    private static int calculate(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                // do nothing
        }
        throw new IllegalArgumentException("操作符只能是(+-*/):" + c);
    }
}