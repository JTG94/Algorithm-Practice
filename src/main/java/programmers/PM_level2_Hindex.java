package programmers;
import java.util.*;

/**
 * Date : 2020.10.17
 * Title : H-index (https://programmers.co.kr/learn/courses/30/lessons/42747)
 * Difficulty : Level 2
 */
public class PM_level2_Hindex {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int ans = -1;
        for(int i = 0 ; i < citations.length ;i++) {
            ans = Math.max(ans, Math.min(citations[i], citations.length - i));
        }
        return ans;
    }
}
