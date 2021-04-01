package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 1. 插入元素, 使用 add 方法进行插入
        set.add("C");
        set.add("C++");
        set.add("Java");
        set.add("Python");
        System.out.println(set);

        // 2. 判定元素是否存在, 这是 Set 最大的意义
        boolean ret = set.contains("Python");
        System.out.println(ret);

        // 3. 删除元素
        set.remove("Python");
        System.out.println(set);

        // 4. 遍历 Set
        //  a) 直接使用 for-each
        for (String key : set) {
            System.out.println(key);
        }
        //  b) 使用迭代器 Iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
