package codility;
import java.util.*;
/**
 * Date : 2021.01.04
 * Title : TapeEquilibrium
 * Difficulty : Lesson 3 - Time Complexity
 * Detected time complexity : O(N)
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 11
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = A.length;

        int a = 0;
        for(int i = 0; i < N-1; i++) {
            a += A[i];
        }
        int b = A[N-1];

        list.add(Math.abs(a-b));

        for(int j = N-2; j >= 1; j--) {
            a -= A[j];
            b += A[j];

            list.add(Math.abs(a-b));
        }

        Collections.sort(list);

        return list.get(0);
    }
}
