package practice.string;
//字符串反转1
public class ReverseString {
    public void reverseString(char[] s) {
        if(s == null || s.length <= 0){
            return;
        }
        int i = 0;
        int j = s.length - 1;
        while(i < j){
            swap(s,i,j);
            i++;
            j--;
        }
        return;
    }
    public void swap(char[] s,int i,int j){
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}
