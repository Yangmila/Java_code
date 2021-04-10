package homework;

public class Atoi {
    public int atoi (String str) {
        str = str.trim();
        if (str.length() == 0){
            return 0;
        }
        int index = 0;
        int res = 0;
        int sign = 1;
        int len = str.length();

        if(str.charAt(index) == '-' || str.charAt(index) == '+'){
            sign = (str.charAt(index++) == '+' ? 1: -1);
        }
        for(;index < len;index++){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9){
                break;
            }
            if(res > Integer.MAX_VALUE /10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }else{
                res = res * 10 + digit;
            }
        }
        return sign * res;
    }
}
