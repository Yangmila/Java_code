package homework;

public class StrStr {
    public int strStr(String haystack, String needle) {
        int L = needle.length();
        int n = haystack.length();

        for(int i = 0;i < n - L + 1;i++){
            if(haystack.substring(i,i + L).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
