package homework;

public class StrToInt {
    public int strToInt(String str) {
        if(str.equals("") || str.length() == 0 || str == null){
            return 0;
        }

        char[] charArray = str.toCharArray();
        boolean flag = true;
        int start = 0;
        int result = 0;

        if(charArray[0] == '+' || charArray[0] == '-'){
            start = 1;
            if(charArray[0] == '-'){
                flag = false;
            }
        }
        for(int i = start;i < charArray.length;i++){
            if(charArray[i] < 48 || charArray[i] > 57){
                return 0;
            }
            int sum = result * 10 + (int)(charArray[i] - 48);
            if((sum - (int)(charArray[i] - 48)) / 10 != result){
                flag = false;
                return 0;
            }
            result = result * 10 + (int)(charArray[i] - 48);
        }
        return result = flag? result : result * (-1);
    }
}
