package practice.jianzhioffer;
//不用加减乘除做加法
//写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
public class Add {
//无进位和运算就是按位异或结果，进位就是与运算结果但是需要左移一位，因为进位影响下一位的运算。
//所以s = a + b,其实就是无进位和+进位的结果。
    //算法步骤：
    //
    //计算a和b的无进位和，和进位
    //如果进位不为0，则说明a+b的结果等于无进位和+进位，此时，把无进位和作为a，进位作为b，继续计算
    //如果进位等于0， 说明此时a+b的结果就等于无进位和，返回无进位和即可
    public int Add(int num1,int num2){
        while (num2 != 0){
            int tmp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = tmp;
        }
        return num1;
    }
}
