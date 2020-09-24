package programmers;
import java.util.*;

/**
 * Date : 2020.09.24
 * Title : 문자열 내림차순으로 배치하기 (https://programmers.co.kr/learn/courses/30/lessons/12917)
 * Difficulty : Level 1
 */
public class PM_level1_문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];
        arr = s.split("");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String c1, String c2) {
                return c2.compareTo(c1);
            }
        });

        for(String v : arr) {
            answer += v;
        }

        return answer;
    }
}
