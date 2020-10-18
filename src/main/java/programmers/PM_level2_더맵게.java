package programmers;
import java.util.*;

/**
 * Date : 2020.10.18
 * Title : 더 맵게 (https://programmers.co.kr/learn/courses/30/lessons/42626)
 * Difficulty : Level 3
 */
public class PM_level2_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 우선순위 큐 초기화
        for(int s : scoville) {
            pq.offer(s);
        }
        int scovil = 0;
        while(pq.peek() <= K) {
            if(pq.size() == 1) {
                return -1;
            }
            scovil = pq.poll() + (pq.poll()*2);
            answer++;
            pq.offer(scovil);
        }
        return answer;
    }
}
