package homework;

public class CanThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i: A){
            sum += i;
        }
        if(sum%3 != 0){
            return false;
        }
        int s = 0;
        int flag = 0;
        for(int i:A){
            s += i;
            if(s == sum/3){
                flag++;
                s = 0;
            }
        }
        return flag >= 3;
    }
}
