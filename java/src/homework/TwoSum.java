package homework;

public class TwoSum {
    public int[] twoSum (int[] numbers, int target) {
        int[] ret = new int[2];
        for(int i = 0;i < numbers.length - 1;i++){
            for(int j = i + 1;j < numbers.length ;j++){
                if(numbers[i] + numbers[j] == target){
                    ret[0] = i + 1;
                    ret[1] = j + 1;
                    return ret;
                }
            }
        }
        return ret;
    }
}
