package codility;
import java.util.*;
/**
 * Date : 2021.02.08
 * Title : Triangle
 * Difficulty : Lesson 6 - Sorting
 * Detected time complexity : O(N*log(N))
 */
public class Triangle {
     public int solution(int[] A) {
        // write your code in Java SE 11
        int N = A.length;
        int answer = 0;

        if (N < 3) {
            return answer;
        }

        Arrays.sort(A);

        for (int i = 0; i < N - 2; i++) {
            if((long)A[i] + (long)A[i+1] > (long)A[i+2]) {
                answer = 1;
                break;
            }
        }

        return answer;     
    }
}
