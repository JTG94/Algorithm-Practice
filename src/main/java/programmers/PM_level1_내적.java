package programmers;

/**
 * Date : 2021.06.17
 * Title : 내적 (https://programmers.co.kr/learn/courses/30/lessons/70128)
 * Difficulty : Level 1
 */
public class PM_level1_내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int length = a.length;
        
        for(int i = 0; i < length; i++) {
            answer += a[i] * b[i];  
        }
        
        return answer;
    }
}
