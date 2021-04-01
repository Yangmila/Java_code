package homework;

public class Exception {
    public static void main(String[] args) {
            System.out.println(divide(10,0));
        }
        public static int divide(int x,int y) {
            if (y == 0) {
                throw new ArithmeticException("抛出除О异常");
            }
            return x / y ;
    }
}
