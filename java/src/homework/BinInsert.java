package homework;
//二进制插入:将m左移j位，再与n相或即可

public class BinInsert {
    int binInsert(int n, int m, int j, int i) {
        // write code here
        int ret=n|(m<<j);
        return ret;
    }
}
