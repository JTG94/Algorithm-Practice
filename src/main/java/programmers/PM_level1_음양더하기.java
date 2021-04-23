package programmers;

/**
 * Date : 2021.04.23
 * Title : 음양 더하기 (https://programmers.co.kr/learn/courses/30/lessons/76501)
 * Difficulty : Level 1
 */
public class PM_level1_완주하지못한선수 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
