package homework;

public class Fibonacci1 {
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int f1 = 0;
        int f2 = 1;
        int f3 = f1 + f2;
        for(int i = 0;i < n;i++){
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
        return f1;
    }
}
