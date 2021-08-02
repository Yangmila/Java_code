package practice.jianzhioffer;

import java.util.TreeSet;

//扑克牌顺子
//现在有2副扑克牌，从扑克牌中随机五张扑克牌，我们需要来判断一下是不是顺子。
public class IsContinuous {
    //顺子，所以首先不能有重复值，
    //如果没有重复值，那么形如[1 2 3 4 5]
    //[5 6 7 8 9]，会发现最大值与最小值的差值应该小于5.
    public boolean IsContinuous(int [] numbers) {
        if(numbers.length < 5 || numbers.length > 5){
            return false;
        }
        TreeSet<Integer> set = new TreeSet<>();
        int count = 0;
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i] != 0){
                set.add(numbers[i]);
            }else{
                count++;
            }
        }
        if((set.size() + count) != 5){
            return false;
        }
        if((set.last() - set.first()) < 5){
            return true;
        }
        return false;
    }
}
