package programmers;
import java.util.*;

/**
 * Date : 2020.10.18
 * Title : 기능개발 (https://programmers.co.kr/learn/courses/30/lessons/42586)
 * Difficulty : Level 2
 */
public class PM_level2_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> deploy_days = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            int days = 0;
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                days++;
            }
            deploy_days.offer(days);
        }
        int cnt = 1;
        int day = deploy_days.poll();
        while(!deploy_days.isEmpty()) {
            if(!deploy_days.isEmpty() && day >= deploy_days.peek()) {
                deploy_days.poll();
                cnt++;
            } else {
                answer.add(cnt);
                day = deploy_days.poll();
                cnt = 1;
            }
        }
        answer.add(cnt);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
