package homework;

public class MyReplace {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "I am your!";
        MyReplace ex = new MyReplace();
        System.out.println("调用 String 类中的 replace 方法: " + str.replace("World", "nihao"));
        System.out.println("自定义的 replace 方法:" + myReplace(str, "World", "nihao"));
        System.out.println("调用 String 类中的 replace 方法: " + str1.replace("oo", "12"));
        System.out.println("自定义的 replace 方法:" + myReplace(str1, "oo", "12"));
    }

    public static String myReplace(String s1, String target, String replacement) {
        String result3 = "";
        int count3 = 0;
        int start = 0;
        for (int i = 0; i <= s1.length() - target.length(); i++) {
            if (i >= start && i + target.length() <= s1.length() && target.equals(s1.substring(i, i + target.length()))) {
                if (count3 == 0) {
                    result3 += s1.substring(0, i) + replacement;
                    start = i + target.length();
                    count3++;
                } else {
                    result3 += s1.substring(start, i) + replacement;
                    start = i + target.length();
                }
            }
        }
        if (start < s1.length()) {
            result3 += s1.substring(start, s1.length());
        }
        return result3;
    }
}
