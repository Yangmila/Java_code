package practice.jianzhioffer;
//JZ7 斐波那契数列
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
//n\leq 39n≤39
public class fibonacci {
    public int Fibonacci(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int f1 = 0;
        int f2 = 1;
        int f = f1 + f2;
        for (int i = 0; i < n; i++) {
            f1 = f2;
            f2 = f;
            f = f1 + f2;
        }
        return f1;
    }

    public int Fibonacci1(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Fibonacci1(n - 1) + Fibonacci1(n - 2);
    }
}
