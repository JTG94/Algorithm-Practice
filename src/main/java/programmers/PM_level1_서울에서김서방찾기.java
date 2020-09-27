package programmers;

/**
 * Date : 2020.09.27
 * Title : 서울에서 김서방 찾기 (https://programmers.co.kr/learn/courses/30/lessons/12919)
 * Difficulty : Level 1
 */
public class PM_level1_서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i +"에 있다";
            }
        }
        return answer;
    }
}
