package programmers;

/**
 * Date : 2020.09.29
 * Title : 이상한 문자 만들기 (https://programmers.co.kr/learn/courses/30/lessons/12930)
 * Difficulty : Level 1
 */
public class PM_level1_이상한문자만들기 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int temp = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                temp = 0;
            } else {
                ch = (temp%2 == 0) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                temp++;
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
