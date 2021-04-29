package homework;
//华为OJ——扑克牌大小
import java.util.Scanner;

public class Poker {
    public static String poker = "345678910JQKA2jokerJOKER";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String s = in.nextLine();
            if(s.contains("joker JOKER")) {
                System.out.println("joker JOKER");
            }else {
                String[] str = s.split("\\-");
                String[] left = str[0].split("\\s");
                String[] right = str[1].split("\\s");
                if(left.length == 4 && right.length != 4) {
                    System.out.println(str[0]);
                }else if(left.length != 4 && right.length == 4) {
                    System.out.println(str[1]);
                }else if(left.length == right.length) {
                    String larger = poker.indexOf(left[0]) > poker.indexOf(right[0]) ? str[0] : str[1];
                    System.out.println(larger);
                }else {
                    System.out.println("ERROR");
                }
            }
        }
        in.close();
    }
}
