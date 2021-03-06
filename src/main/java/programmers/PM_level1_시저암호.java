package programmers;

/**
 * Date : 2020.09.29
 * Title : 시저 암호 (https://programmers.co.kr/learn/courses/30/lessons/12926)
 * Difficulty : Level 1
 */
public class PM_level1_시저암호 {
    public String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)) {
                ch = (char) ((ch + n % 26 - 'a') % 26 + 'a');
            } else if(Character.isUpperCase(ch)) {
                ch = (char) ((ch + n % 26 - 'A') % 26 + 'A');
            }

            answer += ch;
        }
        return answer;
    }
}
