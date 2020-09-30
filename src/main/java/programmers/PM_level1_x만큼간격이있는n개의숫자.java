package programmers;

/**
 * Date : 2020.09.30
 * Title : x만큼 간격이 있는 n개의 숫자 (https://programmers.co.kr/learn/courses/30/lessons/12954)
 * Difficulty : Level 1
 */
public class PM_level1_x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long temp = 0;
        for(int i = 0; i < n; i++) {
            temp = temp + x;
            answer[i] = temp;
        }

        return answer;
    }
}
