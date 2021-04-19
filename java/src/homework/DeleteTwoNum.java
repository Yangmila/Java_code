package homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeleteTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < arr.length;i++){
                arr[i] = i;
            }
            System.out.println(deleteTwoNum(arr));
        }
    }

    public static int deleteTwoNum(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < arr.length;i++){
            queue.add(arr[i]);
        }
        while(queue.size() != 1){
            int count = 0;
            while(count != 2){
                queue.add(queue.peek());
                queue.poll();
                count++;
            }
            queue.poll();
        }
        return queue.peek();
    }
}
