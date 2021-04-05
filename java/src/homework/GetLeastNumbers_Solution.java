package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList ret = new ArrayList();
        Arrays.sort(input);
        if (k > input.length) {
            return ret;
        }
        for (int i = 0; i < k && i < input.length; i++) {
            ret.add(input[i]);
        }
        return ret;
    }
}
