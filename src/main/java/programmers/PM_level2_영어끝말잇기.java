package programmers;
import java.util.*;

/**
 * Date : 2020.10.27
 * Title : 영어 끝말잇기 (https://programmers.co.kr/learn/courses/30/lessons/12981)
 * Difficulty : Level 2
 */
public class PM_level2_영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        ArrayList<String> words_list = new ArrayList<>();
        // 첫번째 단어 넣어줌
        words_list.add(words[0]);

        for(int i = 1; i < words.length; i++) {

            String before_word = words_list.get(i-1);
            if(before_word.charAt(before_word.length()-1) - '0' != words[i].charAt(0) - '0' || words_list.contains(words[i])) {
                break;
            }
            words_list.add(words[i]);
        }
        System.out.println(words_list.size());

        if(words_list.size() != words.length) {

            answer[0] = ((words_list.size()+1) % n);
            if(answer[0] == 0) {
                answer[0] = n;
            }
            answer[1] = (int) Math.ceil((words_list.size()+1) / (double)n);
        }

        return answer;
    }
}
