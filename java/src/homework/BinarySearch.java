package homework;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[]arr,int key) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right) {
            int mid = (left+right)/2;
            if(key<arr[mid]) {
                right=mid-1;
            }
            else if(key>arr[mid]) {
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = new int []{1,2,3,4,5,6,7,8};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(binarySearch(arr,n));
    }
}
