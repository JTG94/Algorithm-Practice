package programmers;
import java.util.*;

/**
 * Date : 2020.10.03
 * Title : 실패율 (https://programmers.co.kr/learn/courses/30/lessons/42889)
 * Difficulty : Level 1
 */
public class PM_level1_실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        // key : stage info value : 실패율
        HashMap<Integer, Double> hm = new HashMap<>();

        for(int i = 1; i <= N; i++) {
            double clear = 0;
            double nClear = 0;
            for(int j = 0; j < stages.length; j++) {
                if(i == stages[j]) {
                    nClear++;
                }

                if(i <= stages[j]) {
                    clear++;
                }
            }
            double failureRate = 0;
            if(clear != 0 && nClear != 0) {
                failureRate = nClear/clear;
            }
            hm.put(i, failureRate);
        }
        List<Integer> keySetList = new ArrayList<>(hm.keySet());
        Collections.sort(keySetList, (o1, o2) -> (hm.get(o2).compareTo(hm.get(o1))));

        int i = 0;
        for(Integer key : keySetList) {
            answer[i++] = key;
        }

        return answer;
    }
}
