package homework;

import java.util.Scanner;

public class NiuNiu_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] b = new int[n];
            for(int i = 0;i < n;i++){
                b[i] = scanner.nextInt();
            }
            int ret = sort(b,n);
            System.out.println(ret);
        }
    }
    public static int sort(int[] b,int n){
        int i = 0;
        int count = 0;
        while(i < n){
            if(b[i] < b[i + i]){
                while(i < n && b[i] < b[i + 1]){
                    i++;
                }
                i++;
                count++;
            }else if(i < n && b[i] == b[i + 1]){
                i++;
            }else if(b[i] > b[i + 1]){
                while(i < n && b[i] > b[i + 1]){
                    i++;
                }
                i++;
                count++;
            }
        }
        return count;
    }
}
