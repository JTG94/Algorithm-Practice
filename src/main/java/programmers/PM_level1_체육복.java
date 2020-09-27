package programmers;

/**
 * Date : 2020.09.27
 * Title : 체육복 (https://programmers.co.kr/learn/courses/30/lessons/42862)
 * Difficulty : Level 1
 */
public class PM_level1_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        answer += n-lost.length;

        for(int i= 0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer += 1;
                    break;
                }
            }
        }

        for(int i= 0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1) {
                    reserve[j] = -1;
                    answer += 1;
                    break;
                }
            }
        }

        return answer;
    }
}
