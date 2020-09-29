package programmers;
import java.util.*;

/**
 * Date : 2020.09.29
 * Title : 정수 내림차순으로 배치하기 (https://programmers.co.kr/learn/courses/30/lessons/12933)
 * Difficulty : Level 1
 */
public class PM_level1_정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;
        String[] s = Long.toString(n).split("");

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length; i++) {
            sb.append(s[i]);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}
