package homework;

public class SysConvert {
    public String solve (int M, int N) {
        if(M == 0){
            return "0";
        }

        String s = "0123456789ABCDEF";
        StringBuffer str = new StringBuffer();
        boolean flag = false;

        if(M < 0){
            flag = true;
            M = -M;
        }
        while(M != 0){
            str.append(s.charAt(M % N));
            M /= N;
        }
        if(flag){
            str.append("-");
        }
        return str.reverse().toString();
    }
}
