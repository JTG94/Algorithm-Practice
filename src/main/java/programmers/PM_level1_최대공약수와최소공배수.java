package programmers;

/**
 * Date : 2020.09.29
 * Title : 최대공약수와 최소공배수 (https://programmers.co.kr/learn/courses/30/lessons/12940)
 * Difficulty : Level 1
 */
public class PM_level1_최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n,m);

        for(int i = max; i > 0; i--) {
            // 최대 공약 수
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }

        answer[1] = (n*m)/answer[0];

        return answer;
    }
}
