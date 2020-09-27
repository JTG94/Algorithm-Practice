package programmers;

/**
 * Date : 2020.09.27
 * Title : 2016년 (https://programmers.co.kr/learn/courses/30/lessons/12901)
 * Difficulty : Level 1
 */
public class PM_level1_2016년 {
    public String solution(int a, int b) {
        String answer = "";
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] Days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int totalDays = 0;
        for(int i = 0; i < a-1 ; i++) {
            totalDays += monthDays[i];
        }
        totalDays += b;
        totalDays -= 1;
        totalDays %= 7;

        return Days[totalDays];
    }
}
