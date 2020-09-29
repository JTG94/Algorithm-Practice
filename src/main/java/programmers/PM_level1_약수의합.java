package programmers;

/**
 * Date : 2020.09.29
 * Title : 약수의 합 (https://programmers.co.kr/learn/courses/30/lessons/12928)
 * Difficulty : Level 1
 */
public class PM_level1_약수의합 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i<=Math.sqrt(n); i++) {
            for(int j = n; j>=Math.sqrt(n); j--) {
                if(i*j == n) {
                    if(i!=j) {
                        answer += (i+j);
                    } else {
                        answer += i;
                    }
                    break;
                }
            }
        }

        return answer;
    }
}
