package dailyOneprobleme;
//解读密码
import java.util.Scanner;

public class JieDuMiMa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i < str.length();i++){
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
