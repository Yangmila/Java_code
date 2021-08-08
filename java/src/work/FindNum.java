package work;

import java.util.HashMap;
import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(num > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            helper(nums,n,k);
            num--;
        }
    }
    public static void helper(int[] nums,int n,int k){
        int count = 0;
        int x = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        while (x <= n){
            for (int i = 0; i < n; i++) {
                if(nums[i] < x){
                    Integer value = map.getOrDefault(x,0);
                    map.put(x,value + 1);
                }
            }
            x++;
        }
        for (int i = 1; i <= n; i++) {
            Integer ret = map.get(i);
            if (ret != k){
                System.out.println("No");
            }else{
                System.out.println("Yes");
                System.out.println(map.get(i));
            }
        }

    }
}
