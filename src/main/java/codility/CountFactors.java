pacakge codility;
/**
 * Date : 2021.07.17
 * Title : CountFactors
 * Difficulty : Lesson 10 - Prime and composite numbers
 * Detected time complexity : O(sqrt(N))
 */
public class CountFactors {
    public int solution(int N) {
        // write your code in Java SE 11
        int result = 0;
        for (int i = 1; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                result += 2;
            }
        }

        if (N % Math.sqrt(N) == 0) {
            result += 1;
        }
        
        return result;
    }
}