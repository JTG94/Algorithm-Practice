package programmers;
import java.util.*;

/**
 * Date : 2020.10.18
 * Title : 다리를 지나는 트럭 (https://programmers.co.kr/learn/courses/30/lessons/42583)
 * Difficulty : Level 2
 */
public class PM_level2_다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        int tot_weight = 0;

        for(int tw : truck_weights) {
            while(true) {
                if(q.isEmpty()) {
                    q.offer(tw);
                    tot_weight += tw;
                    answer++;
                    break;
                } else if(q.size() == bridge_length) {
                    tot_weight -= q.poll();
                } else {
                    if(tot_weight + tw > weight) {
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(tw);
                        tot_weight += tw;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer+bridge_length;
    }
}
