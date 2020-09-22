package programmers;
import java.util.*;

/**
 * Date : 2020.09.22
 * Title : 모의고사 (https://programmers.co.kr/learn/courses/30/lessons/42840)
 * Difficulty : Level 1
 */
public class PM_level1_모의고사 {
    class Solution {
        public int[] solution(int[] answers) {
            int[] pattern1 = {1,2,3,4,5};
            int[] pattern2 = {2,1,2,3,2,4,2,5};
            int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};

            int[] scores = {0, 0, 0};
            for(int i = 0; i<answers.length; i++) {
                if(answers[i] == pattern1[i%5]) {
                    scores[0]++;
                }
                if(answers[i] == pattern2[i%8]) {
                    scores[1]++;
                }
                if(answers[i] == pattern3[i%10]) {
                    scores[2]++;
                }
            }
            int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
            ArrayList<Integer> list = new ArrayList<>();
            if(maxScore == scores[0]) {list.add(1);}
            if(maxScore == scores[1]) {list.add(2);}
            if(maxScore == scores[2]) {list.add(3);}
            return list.stream().mapToInt(i->i.intValue()).toArray();
        }
    }
}
