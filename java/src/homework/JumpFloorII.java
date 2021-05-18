package homework;

public class JumpFloorII {
    public int jumpFloorII(int target) {
        if(target == 0){
            return 0;
        }
        int a[] = new int[target + 2];
        int b = 3;
        a[0] = 1;
        a[1] = 1;
        a[2] = 2;
        if(target < b && target > 0){
            return a[target];
        }
        for(int i = 3;i <= target;i++){
            a[i] = 2 * a[i - 1];
        }
        return a[target];
    }
}
