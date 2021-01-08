package codility;
/**
 * Date : 2021.01.08
 * Title : CountDiv
 * Difficulty : Lesson 5 - Prefix Sums
 * Detected time complexity : O(1)
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 11
        boolean A_flag = ((A%K) == 0) ? true : false;

        int answer = (B/K)-(A/K);

        if(A_flag) {
            answer++;
        }

        return answer;
    }
}
