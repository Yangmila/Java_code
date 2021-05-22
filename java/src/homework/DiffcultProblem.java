package homework;

import java.util.Scanner;

//最难的问题
public class DiffcultProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            char[] arr = str.toCharArray();
            StringBuffer sb = new StringBuffer();

            for(int i = 0;i < str.length();i++){
                char c = arr[i];
                if(c != ' '){
                    if(c > 'E'){
                        c = (char)((int)c - 5);
                    }else {
                        c = (char)((int)c + 21);
                    }
                }
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
