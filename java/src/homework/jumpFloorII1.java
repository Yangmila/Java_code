package homework;
//对于方法一中的：f[n] = f[n-1] + f[n-2] + ... + f[0]
//
//那么f[n-1] 为多少呢？
//
//f[n-1] = f[n-2] + f[n-3] + ... + f[0]
//
//所以一合并，f[n] = 2*f[n-1]，初始条件f[0] = f[1] = 1
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
        return 1 << (target - 1);//  口诀：左移乘2，右移除2
    }
}
