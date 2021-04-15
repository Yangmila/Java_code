package homework;

public class Judge {
    public boolean judge (String str) {
        int len = str.length();
        for(int i = 0;i < len;i++){
            if(str.charAt(i) != str.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
