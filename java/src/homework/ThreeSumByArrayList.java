package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumByArrayList {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        int len = num.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        if(num == null || len < 3){
            return ans;
        }
        for(int i = 0;i < len;i++){
            int left = i + 1;
            int right = len - 1;
            int sum = 0;
            if(num[i] > 0){
                break;
            }
            if(i > 0 && num[i] == num[i - 1]){
                continue;
            }
            while(left < right){
                sum = num[i] + num[left] + num[right];
                if(sum == 0){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    ans.add(list);

                    while(left < right && num[left] == num[left + 1]){
                        left++;
                    }
                    while(left < right && num[right] == num[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right--;
                }
            }
        }
        return ans;
    }
}
