package programmers;
import java.util.*;

/**
 * Date : 2020.09.29
 * Title : [카카오 인턴] 키패드 누르기 (https://programmers.co.kr/learn/courses/30/lessons/67256)
 * Difficulty : Level 1
 */
public class PM_level1_카카오인턴키패드누르기 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> leftList = new ArrayList<>(Arrays.asList(1, 4, 7));
        ArrayList<Integer> rightList = new ArrayList<>(Arrays.asList(3, 6, 9));

        int curLeft = 10;
        int curRight = 12;

        for(int i = 0; i < numbers.length; i++) {
            if (leftList.contains(numbers[i])) {
                answer.append("L");
                curLeft = numbers[i];
            } else if (rightList.contains(numbers[i])) {
                answer.append("R");
                curRight = numbers[i];
            } else {
                int disL = getDist(curLeft, numbers[i]);
                int disR = getDist(curRight, numbers[i]);

                if(disL > disR) {
                    answer.append("R");
                    curRight = numbers[i];
                } else if (disL < disR) {
                    answer.append("L");
                    curLeft = numbers[i];
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        curRight = numbers[i];
                    } else {
                        answer.append("L");
                        curLeft = numbers[i];
                    }
                }
            }

        }
        return answer.toString();
    }

    public static int getDist(int location, int number) {

        if(number == 0) {
            number = 11;
        }

        if(location == 0) {
            location = 11;
        }

        int locationX = (location-1) / 3;
        int locationY = (location-1) % 3;

        int numberX = (number-1) / 3;
        int numberY = (number-1) % 3;

        return Math.abs(locationX-numberX) + Math.abs(locationY - numberY);
    }
}
