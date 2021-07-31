package programmers;
import java.util.*;

/**
 * Date : 2021.07.31
 * Title : 로또의 최고 순위와 최저 순위 (https://programmers.co.kr/learn/courses/30/lessons/77484)
 * Difficulty : Level 1
 */
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int number = 0;
        int zero = 0;
        ArrayList<Integer> win_list = new ArrayList<>();
        for (int n : win_nums) {
            win_list.add(n);
        }
        
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zero++;
            } else {
                if (win_list.contains(lottos[i])) {
                    number++;
                }
            }
        }
        
        answer[0] = getRank(number + zero);
        answer[1] = getRank(number);
         
        return answer;
    }
    
    
    public static int getRank (int N) {
        int rank = 0;
        if (N == 6) {
            rank = 1;
        } else if (N == 5) {
            rank = 2;
        } else if (N == 4) {
            rank = 3;
        } else if (N == 3) {
            rank = 4;
        } else if (N == 2) {
            rank = 5;
        } else {
            rank = 6;
        }
        
        return rank;
    }
}