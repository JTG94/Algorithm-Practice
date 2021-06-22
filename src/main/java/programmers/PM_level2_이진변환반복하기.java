package programmers;

/**
 * Date : 2021.06.22
 * Title : 이진 변환 반복하기 (https://programmers.co.kr/learn/courses/30/lessons/70129)
 * Difficulty : Level 2
 */
public class PM_level2_이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")) {
            answer[0]++;
            String temp = s.replaceAll("0", "");
            answer[1] += s.length() - temp.length();
            s = Integer.toBinaryString(temp.length());
        }
        
        return answer;
    }
}