package homework;

public class Print {
    public static void printArray(int[] arr) {
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {21,43,2,45,76,85,35};
        printArray(arr);
    }
}

