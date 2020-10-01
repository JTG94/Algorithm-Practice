package programmers;
import java.util.*;

/**
 * Date : 2020.10.01
 * Title : 예산 (https://programmers.co.kr/learn/courses/30/lessons/12982)
 * Difficulty : Level 1
 */
public class PM_level1_예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {
            if(sum + d[i] > budget) {
                break;
            }

            sum += d[i];
            answer++;
        }
        return answer;
    }
}
