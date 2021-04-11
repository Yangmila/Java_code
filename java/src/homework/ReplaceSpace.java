package homework;

public class ReplaceSpace {
    public String replaceSpace (String s) {
        StringBuffer str = new StringBuffer();
        if(s == null || "".equals(s)){
            return s;
        }
        String[] str1 = s.split("");
        for(int i = 0;i < s.length();i++){
            if(" ".equals(str1[i])){
                str.append("%20");
            }else{
                str.append(str1[i]);
            }
        }
        return str.toString();
    }
}
