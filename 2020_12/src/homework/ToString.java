package homework;

public class ToString {
    public static String toString(int[] arr){
        String ret = "\"";
        ret += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                ret += arr[i] + ",";
            } else if (i == arr.length - 1) {
                ret += arr[i] + "]";
            }
        }
        ret += "\"";
        return ret;
    }
    public static void main(String[] args) {
        int[] arr = {21,24,34,45,65,67,87};
        String str = toString(arr);
        System.out.println(str);
    }
}
