package homework;
//查找两个字符串a,b中的最长公共子串
import java.util.Scanner;

public class iQueryMaxCommString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String A = scanner.next();
            String B = scanner.next();

            System.out.println(IQueryMaxCommString(A,B));
        }
    }

    private static String IQueryMaxCommString(String A, String B) {
        if(A==null || B==null){
            return null;
        }
        if(A.length()<1 || B.length()<1){
            return "";
        }
        if (A.contains(B)) {
            return B;
        }
        else if (B.length() == 1) {
            return "";
        }

        String leftSerach = IQueryMaxCommString(A, B.substring(0, B.length() - 1));
        String rightSerach = IQueryMaxCommString(A, B.substring(1, B.length()));
        return leftSerach.length() >= rightSerach.length() ? leftSerach : rightSerach;
    }
}
