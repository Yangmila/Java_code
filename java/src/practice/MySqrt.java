package practice;
// x 的平方根
//实现 int sqrt(int x) 函数。
//
//计算并返回 x 的平方根，其中 x 是非负整数。
//
//由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
public class MySqrt {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ret = -1;
        if(x == 1){
            return 1;
        }
        while(left <= right){
            int middle = left + (right - left) / 2;
            if((long)middle * middle > x){
                right = middle - 1;
            }else{
                ret = middle;
                left = middle + 1;
            }
        }
        return ret;
    }
}
