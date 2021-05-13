package homework;
//微信红包
import java.util.HashMap;

public class GetValue {
    public int getValue(int[] gifts, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < gifts.length;i++){
            if(map.containsKey(gifts[i])){
                map.put(gifts[i],map.get(gifts[i]) + 1);
            }else {
                map.put(gifts[i],1);
            }
            if (map.get(gifts[i]) > gifts.length / 2){
                return gifts[i];
            }
        }
        return 0;
    }
}
