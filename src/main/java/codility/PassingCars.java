package codility;
/**
 * Date : 2021.01.18
 * Title : PassingCars
 * Difficulty : Lesson 5 - Prefix Sums
 * Detected time complexity : O(N)
 */
public class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 11
        int answer = 0;
        int sum_gap = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                sum_gap++;
            } else {
                answer += sum_gap;
            }
        }

        if (answer > 1000000000 || answer < 0) {
            return -1;
        }

        return answer;
    }
}
