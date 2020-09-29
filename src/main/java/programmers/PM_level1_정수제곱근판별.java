package programmers;

/**
 * Date : 2020.09.29
 * Title : 정수 제곱근 판별 (https://programmers.co.kr/learn/courses/30/lessons/12934)
 * Difficulty : Level 1
 */
public class PM_level1_정수제곱근판별 {
    public long solution(long n) {
        long answer = -1;

        double a = Math.sqrt(n);
        double check = a - (int)a;

        if(check == 0) {
            answer = (long) Math.pow(a+1, 2);
        }
        return answer;
    }
}
