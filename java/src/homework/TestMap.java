package homework;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        // 1. 使用 put 方法插入键值对
        map.put("黑旋风", "李逵");
        map.put("及时雨", "宋江");
        map.put("行者", "武松");
        map.put("小李广", "花荣觉醒形态");
        map.put("及时雨", "宋公明");
        System.out.println(map);

        // 2. 使用 Map 最大的目的往往是要根据 key 来找 value
        String value = map.get("李逵");
        value = map.getOrDefault("小李广","花荣");
        System.out.println(value);

        // 3. 使用 size() 获取包含多少个 "键值对"
        System.out.println(map.size());

        // 4. 使用 isEmpty 判定是否没有键值对(size 为 0)
        System.out.println(map.isEmpty());

        // 5. 使用 clear 清空所有键值对
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        // 6. 遍历 map (稍微复杂一点)
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key);
        }

//        for (String value : map.values()) {
//            System.out.println(value);
//        }
    }
}

