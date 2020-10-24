package programmers;
import java.util.*;

/**
 * Date : 2020.10.24
 * Title : 최솟값 만들기 (https://programmers.co.kr/learn/courses/30/lessons/12941?language=java)
 * Difficulty : Level 2
 */
public class PM_level2_최솟값만들기 {
    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0;i<A.length;i++) {
            answer += (A[i]*B[A.length-i-1]);
        }

        return answer;
    }
}
