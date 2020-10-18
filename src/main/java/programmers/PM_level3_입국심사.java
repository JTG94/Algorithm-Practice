package programmers;
import java.util.*;

/**
 * Date : 2020.10.18
 * Title : 입국심사 (https://programmers.co.kr/learn/courses/30/lessons/43238)
 * Difficulty : Level 3
 */
public class PM_level3_입국심사 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long start = 0;
        long mid = 0;
        long end = (long)times[times.length-1] * n; // 가장 오래걸리는 시간
        long answer = Long.MAX_VALUE;
        while(start <= end) {
            long sum = 0;
            mid = (start+end) / 2;
            for(int time : times) {
                sum += mid/time;
            }
            if (sum < n) {
                start = mid + 1;
            } else {
                if(answer>mid) {
                    answer = mid;
                }
                end = mid - 1;
            }
        }
        return answer;
    }
}
