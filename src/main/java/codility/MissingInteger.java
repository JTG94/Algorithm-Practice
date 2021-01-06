package codility;
import java.util.*;
/**
 * Date : 2021.01.06
 * Title : MissingInteger
 * Difficulty : Lesson 4 - Counting Elements
 * Detected time complexity : O(N) or O(N * log(N))
 */
public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 11
        Arrays.sort(A);

        int answer = 1;

        for(int i = 0; i < A.length; i++) {
            if(A[i] == answer) {
                answer++;
            }
        }

        return answer;
    }
}
