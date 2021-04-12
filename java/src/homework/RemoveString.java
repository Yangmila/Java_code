package homework;

import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        remove(s1,s2);
    }
    public static void remove(String a,String b){
        String[] str = a.split("");
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < a.length();i++){
            if(!b.contains(str[i])){
                sb.append(str[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
