package programmers;

/**
 * Date : 2020.09.23
 * Title : 두 정수 사이의 합 (https://programmers.co.kr/learn/courses/30/lessons/12912)
 * Difficulty : Level 1
 */
public class PM_level1_두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;

        if(a <= b) {
            for(int i = a; i<= b; i++) {
                answer += Long.valueOf(i);
            }
        } else {
            for(int i = b; i<= a; i++) {
                answer += Long.valueOf(i);
            }
        }
        return answer;
    }
}
