package programmers;
import java.util.*;

/**
 * Date : 2021.07.31
 * Title : 포켓몬 (https://programmers.co.kr/learn/courses/30/lessons/1845)
 * Difficulty : Level 1
 */
class Solution {
    public int solution(int[] nums) {
        int result = 0;
        int max_kind = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        
        for (int n : nums) {
            set.add(n);
        }
        
        if (set.size() < max_kind) {
            result = set.size();
        } else {
            result = max_kind;
        }
        
        return result;
    }
}