package programmers;
import java.util.*;

/**
 * Date : 2020.09.24
 * Title : 문자열 내 마음대로 정렬하기 (https://programmers.co.kr/learn/courses/30/lessons/12915)
 * Difficulty : Level 1
 */
public class PM_level1_문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if (c1 == c2) {
                    return s1.compareTo(s2);
                } else {
                    return c1 - c2;
                }
            }
        });
        return strings;
    }
}
