package programmers;

/**
 * Date : 2021.06.16
 * Title : 약수의 개수와 덧셈 (https://programmers.co.kr/learn/courses/30/lessons/77884)
 * Difficulty : Level 1
 */
public class PM_level1_약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
