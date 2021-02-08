package codility;
import java.util.*;
/**
 * Date : 2021.02.08
 * Title : NumberOfDiscIntersections
 * Difficulty : Lesson 6 - Sorting
 * Detected time complexity : O(N*log(N)) or O(N)
 */
public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        // write your code in Java SE 11
        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for(int i = 0; i < A.length; i++) {
            lower[i] = i - (long)A[i];
            upper[i] = i + (long)A[i];
        }

        Arrays.sort(upper);
        Arrays.sort(lower);

        int intersection = 0;
        int j = 0;

        for(int i = 0; i < A.length; i++) {
            while(j < A.length && upper[i] >= lower[j]) {
                intersection += j;
                intersection -= i;
                j++;
            }
        }

        if(intersection > 10_000_000)
            return -1;

        return intersection;
    }
}
