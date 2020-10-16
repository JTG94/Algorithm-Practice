package programmers;

/**
 * Date : 2020.10.16
 * Title : 큰 수 만들기 (https://programmers.co.kr/learn/courses/30/lessons/42883)
 * Difficulty : Level 2
 */
public class PM_level2_큰수만들기 {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int result_length = number.length()-k;
        int start_idx = 0;
        int sub_idx = 0;

        while(result_length > 0) {
            int max = -1;
            for(int i = start_idx; i <= number.length()- result_length; i++) {
                int value = number.charAt(i)-'0';
                if(value > max) {
                    max = value;
                    sub_idx = i+1;
                }
            }
            start_idx = sub_idx;
            sb.append(String.valueOf(max));
            result_length--;
        }
        return sb.toString();
    }
}
