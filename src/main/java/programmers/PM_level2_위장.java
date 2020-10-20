package programmers;
import java.util.*;

/**
 * Date : 2020.10.20
 * Title : 위장 (https://programmers.co.kr/learn/courses/30/lessons/42578)
 * Difficulty : Level 2
 */
public class PM_level2_위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();

        for(int i =0; i<clothes.length; i++){
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }

        for(String key :  clothesMap.keySet()) {
            answer *= clothesMap.get(key)+1;
        }
        return answer-1;
    }
}
