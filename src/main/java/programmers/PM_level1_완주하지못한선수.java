package programmers;
import java.util.*;

/**
 * Date : 2020.09.21
 * Title : 완주하지 못한 선수 (https://programmers.co.kr/learn/courses/30/lessons/42576?language=java)
 * Difficulty : Level 1
 */
public class PM_level1_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for(i=0; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }
}
