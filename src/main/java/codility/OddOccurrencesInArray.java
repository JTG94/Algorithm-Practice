package codility;
/**
 * Date : 2020.12.21
 * Title : OddOccurrencesInArray
 * Difficulty : Lesson 2 - Arrays
 * Detected time complexity : O(N) or O(N*log(N))
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int answer = 0;
        for(int num : A) {
            answer ^= num;
        }
        return answer;
    }
}
