package homework;

public class MyIndexOf {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("调用 String 类中的 indexOf 方法: " + str.indexOf("World"));
        System.out.println("自定义的 indexOf 方法:" + myIndexOf(str,"World"));
    }

    public static int myIndexOf(String str, String str1) {
        if (str1 == null) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i + str1.length() <= str.length() && str.substring(i,i + str1.length()).equals(str1)) {
                return i;
            }
        }
        return -1;
    }
}
