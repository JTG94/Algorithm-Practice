package codility;
import java.util.*;
/**
 * Date : 2021.01.05
 * Title : FrogRiverOne
 * Difficulty : Lesson 4 - Counting Elements
 * Detected time complexity : O(N)
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 11
        int total_sec = A.length;
        HashSet<Integer> hset = new HashSet<>();

        int answer_sec = 0;
        for(int i = 0; i < total_sec; i++) {
            if(hset.size() == X) {
                break;
            }
            hset.add(A[i]);
            answer_sec = i;
        }

        if(hset.size() != X) {
            return -1;
        }

        return answer_sec;
    }
}
