package homework;

public class ToLowerCase {
    public static String toLowerCase(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] += 32;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
       String str = "ASFF";
       String str1=toLowerCase(str);
       System.out.println(str1);
    }
}
