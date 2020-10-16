package programmers;
import java.util.*;

/**
 * Date : 2020.10.16
 * Title : 큰 수 만들기 (https://programmers.co.kr/learn/courses/30/lessons/42885)
 * Difficulty : Level 2
 */
public class PM_level2_구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int light = 0;

        Arrays.sort(people);

        for(int heavy = people.length-1; light <= heavy; heavy--) {
            if(people[light] + people[heavy] <= limit) {
                light++;
            }
            answer++;
        }
        return answer;
    }
}
