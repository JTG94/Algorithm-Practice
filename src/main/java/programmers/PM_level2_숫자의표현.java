package programmers;

/**
 * Date : 2020.10.13
 * Title : 숫자의 표현 (https://programmers.co.kr/learn/courses/30/lessons/12924)
 * Difficulty : Level 2
 */
public class PM_level2_숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;

                if(sum==n) {
                    answer++;
                    break;
                } else if(sum>n) {
                    break;
                }
            }
        }
        return answer;
    }
}
