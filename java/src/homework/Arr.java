package homework;

import java.util.ArrayList;
import java.util.List;

public class Arr {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
        public static List<List<Integer>> subsets(int[] nums) {
            List<Integer> t = new ArrayList<Integer>();
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            int n = nums.length;
            for (int mask = 0; mask < (1 << n); ++mask) {
                t.clear();
                for (int i = 0; i < n; ++i) {
                    if ((mask & (1 << i)) != 0) {
                        t.add(nums[i]);
                    }
                }
                ans.add(new ArrayList<Integer>(t));
            }
            return ans;
    }
}
