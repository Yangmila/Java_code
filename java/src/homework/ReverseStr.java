package homework;

public class ReverseStr {
    public String solve (String str) {
        char[] ans = str.toCharArray();
        int len = str.length();
        for(int i = 0 ; i < len ;i++)
        {
            ans[i] = str.charAt(len-1-i);
        }
        return new String(ans);
    }
}
