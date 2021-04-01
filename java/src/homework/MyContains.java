package homework;

public class MyContains {public static void main(String[] args) {
    String str = " Hello World";
    System.out.println("调用 String 类中的 isContains 方法: " + str.contains("World"));
    System.out.println("自定义的 isContains 方法:" + isContains(str,"World"));
    System.out.println("调用 String 类中的 isContains 方法: " + str.contains("dd"));
    System.out.println("自定义的 isContains 方法:" + isContains(str,"dd"));
}

    public static boolean isContains(String str, String str1) {
        for (int i = 0; i < str.length(); i++) {
            if (i + str1.length() <= str.length() && str.substring(i, i + str1.length()).equals(str1)) {
                return true;
            }
        }
        return false;
    }
}
