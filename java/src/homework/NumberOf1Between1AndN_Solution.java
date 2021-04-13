package homework;

public class NumberOf1Between1AndN_Solution {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(NumberOf1Between1AndN_Solution(n));
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i = 1 ;i <= n ;i++){
            int tmp = i;
            while(tmp != 0){
                if(tmp % 10 == 1){
                    count++;
                }
                tmp = tmp / 10;
            }
        }
        return count;
    }
}
