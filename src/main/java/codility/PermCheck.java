package codility;
import java.util.*;
/**
 * Date : 2021.01.08
 * Title : PermCheck
 * Difficulty : Lesson 4 - Counting Elements
 * Detected time complexity : O(N) or O(N * log(N))
 */
public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 11
        int answer = 1;
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++) {
            if(i+1 != A[i]) {
                return 0;
            }
        }

        return answer;
    }
}
