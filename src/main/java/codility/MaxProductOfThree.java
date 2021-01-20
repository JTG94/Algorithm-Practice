package codility;
import java.util.*;
/**
 * Date : 2021.01.20
 * Title : MaxProductOfThree
 * Difficulty : Lesson 6 - Sorting
 * Detected time complexity : O(N * log(N))
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 11
        Arrays.sort(A);
        int last_idx = A.length-1;

        int answer = A[last_idx] * A[last_idx-1] * A[last_idx-2];

        if (A[0] <= 0 && A[1] <= 0 && A[last_idx] >= 0) {
            answer = Math.max(answer, A[0] * A[1] * A[last_idx]);
        }

        return answer;
    }
}
