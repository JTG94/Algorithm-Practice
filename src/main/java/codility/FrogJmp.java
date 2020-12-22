package codility;

/**
 * Date : 2020.12.22
 * Title : FrogJmp
 * Difficulty : Lesson 3
 * Detected time complexity : O(1)
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int answer = ((Y-X)%D != 0) ? (Y-X)/D + 1 : (Y-X)/D;
        return answer;
    }
}
