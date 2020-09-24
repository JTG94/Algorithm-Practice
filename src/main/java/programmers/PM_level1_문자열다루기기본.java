package programmers;

/**
 * Date : 2020.09.24
 * Title : 문자열 다루기 기본 (https://programmers.co.kr/learn/courses/30/lessons/12918)
 * Difficulty : Level 1
 */
public class PM_level1_문자열다루기기본 {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() ==6) {
            try{
                int check = Integer.parseInt(s);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return answer;
    }
}
