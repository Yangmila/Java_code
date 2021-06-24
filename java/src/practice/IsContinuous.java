package practice;
//扑克牌顺子
//现在有2副扑克牌，从扑克牌中随机五张扑克牌，我们需要来判断一下是不是顺子。
//有如下规则：
//1. A为1，J为11，Q为12，K为13，A不能视为14
//2. 大、小王为 0，0可以看作任意牌
//3. 如果给出的五张牌能组成顺子（即这五张牌是连续的）就输出true，否则就输出false。
//例如：给出数据[6,0,2,0,4]
//中间的两个0一个看作3，一个看作5 。即：[6,3,2,5,4]
//这样这五张牌在[2,6]区间连续，输出true
//数据保证每组5个数字，每组最多含有4个零，数组的数取值为 [0, 13]
import java.util.TreeSet;
//简单来说就是要是5个数字，最大和最小差值在5以内，并且没有重复数值。
//用一个set来填充数据，0不要放进去.
//set的大小加上0的个数必须为5个。此外set中数值差值在5以内。
public class IsContinuous {
    public boolean IsContinuous(int [] numbers) {
        if (numbers.length < 5 || numbers.length > 5){
            return false;
        }
        int num = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                num++;
            }else {
                set.add(numbers[i]);
            }
        }
        if (set.size() + num != 5){
            return false;
        }
        if (set.last() - set.first() < 5){
            return true;
        }
        return false;
    }
}
