package codility;
/**
 * Date : 2021.01.04
 * Title : PermMissingElem
 * Difficulty : Lesson 3 - Time Complexity
 * Detected time complexity : O(N) or O(N * log(N))
 */
public class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 11
        int N = A.length;
        boolean[] flagArr = new boolean[N+2];

        for(int i = 0; i < N; i++) {
            flagArr[A[i]] = true;
        }
        int answer = 0;
        for (int j = 1; j < N+2; j++) {
            if(!flagArr[j]) {
                answer = j;
            }
        }
        return answer;
    }
}
