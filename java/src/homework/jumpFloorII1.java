package homework;

public class jumpFloorII1 {
    public int jumpFloorII(int target) {
        if(target == 0){
            return 0;
        }
//        int ret = 1;
//        for(int i = 2;i <= target;i++){
//            ret *= 2;
//        }
//        return ret;
        return 1 << (target - 1);
    }
}
