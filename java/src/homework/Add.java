package homework;
//加法
//java中的异或运算符号是 ^   二进制加法，不考虑进位，就是异或运算。可自行验证
//java中的左移运算符，在左移后最右边补0。按位与运算再左移一位，恰符合进位的实际情况

public class Add {
    public int Add(int num1,int num2) {
        while(num2 != 0){
            int tmp = (num1 & num2) << 1;//进位。即二进制与，再左移
            num1 = num1 ^ num2;//直接相加，不考虑进位。即二进制异或操作
            num2 = tmp;//num2作为进位
        }
        return num1;
    }
}
