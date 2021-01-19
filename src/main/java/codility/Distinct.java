package codility;
/**
 * Date : 2021.01.19
 * Title : Distinct
 * Difficulty : Lesson 6 - Sorting
 * Detected time complexity : O(N*log(N)) or O(N)
 */
public class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 11
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int n : A) {
            hs.add(n);
        }

        return hs.size();
    }
}
