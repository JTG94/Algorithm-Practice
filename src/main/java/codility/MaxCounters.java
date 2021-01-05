package codility;
import java.util.*;
/**
 * Date : 2021.01.05
 * Title : MaxCounters
 * Difficulty : Lesson 4 - Counting Elements
 * Detected time complexity : O(N + M)
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 11
        int[] answer = new int[N];
        Arrays.fill(answer, 0);
        int temp = 0;
        int max = 0;

        for(int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                max = temp;
                continue;
            }

            if (answer[A[i] -1] < max) {
                answer[A[i] -1] = max;
            }

            answer[A[i] -1]++;

            if (answer[A[i] -1] > temp) {
                temp = answer[A[i] -1];
            }
        }

        for (int i = 0; i < N; i++) {
            if (answer[i] < max) {
                answer[i] = max;
            }
        }

        return answer;
    }
}
