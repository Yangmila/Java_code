package homework;

public class EvalRPN {
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int ret = evalRPN(tokens);
        System.out.println(ret);
    }

    public static int evalRPN(String[] tokens) {
        int[] numStack = new int[tokens.length / 2 + 1];
        int index = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    numStack[index - 2] += numStack[--index];
                    break;
                case "-":
                    numStack[index - 2] -= numStack[--index];
                    break;
                case "*":
                    numStack[index - 2] *= numStack[--index];
                    break;
                case "/":
                    numStack[index - 2] /= numStack[--index];
                    break;
                default:
                    numStack[index++] = Integer.valueOf(s);
                    break;
            }
        }
        return numStack[0];
    }
}