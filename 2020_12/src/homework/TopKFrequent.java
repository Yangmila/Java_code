package homework;

import java.util.*;

public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            Integer value = map.getOrDefault(word,0);
            map.put(word,value + 1);
        }

        List<String> wordList = new ArrayList<>(map.keySet());
        Collections.sort(wordList,new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                int count1 = map.get(o1);
                int count2 = map.get(o2);
                if(count1 == count2){
                    return o1.compareTo(o2);
                }
                return count2 - count1;
            }
        });
        return wordList.subList(0,k);
    }
}
