package practice;
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
//保证base和exponent不同时为0。不得使用库函数，同时不需要考虑大数问题，也不用考虑小数点后面0的位数。
public class NumPower {
    public double Power(double base, int exponent) {
        if(exponent < 0){
            base = 1 / base;
            exponent = -exponent;
        }
        double ret = 1.0;
        for(int i = 1;i <= exponent;i++){
            ret *= base;
        }
        return ret;
    }
}
