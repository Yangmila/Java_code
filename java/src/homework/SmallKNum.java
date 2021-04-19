package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SmallKNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while(scanner.hasNextLine()){
            list.add(scanner.nextInt());
        }

        int k = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        int[] arr = new int[list.size()];

        for (int i = 0;i < list.size();i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        for(int i = 0;i < k - 1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[k - 1]);
    }
}
