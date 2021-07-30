package practice.jianzhioffer;
//替换空格
//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
public class ReplaceSpace {
    public String replaceSpace(String s) {
        if(s == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
