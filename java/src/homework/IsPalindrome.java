package homework;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        int last = 0;
        int res = 0;
        int prev = x;
        if(x < 0){
            return false;
        }
        while(x != 0){
            last = x % 10;
            res = last + res * 10;
            x = x / 10;
        }
        if(prev == res){
            return true;
        }
        return false;
    }
}
