package programmers;
import java.util.*;

/**
 * Date : 2021.08.13
 * Title : 상호 평가 (https://programmers.co.kr/learn/courses/30/lessons/83201)
 * Difficulty : Level 1
 */
class PM_level1_상호평가 {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < scores.length; i++) {
            ArrayList<Integer> user_score = new ArrayList<>();
            int self_score = 0;
            for (int j = 0; j < scores.length; j++) {
                if (i != j) {
                    user_score.add(scores[j][i]);    
                }  else {
                    self_score = scores[j][i];
                }
            }
            
            double avg = get_average(self_score, user_score);
            answer.append(get_grade(avg));
        }
        return answer.toString();
    }
    
    public double get_average(int self_score, ArrayList<Integer> user_score) {
        int sum = 0;
        int length = user_score.size();
        boolean is_min_max = false;
        Collections.sort(user_score);
        
        for (int i = 0; i < length; i++) {
            sum += user_score.get(i).intValue();
        }
        
        if (user_score.get(0).intValue() <= self_score && user_score.get(length - 1).intValue() >= self_score) {
            sum += self_score;
            length += 1;
        }
        
        
        return sum / (double) length;
    }
    
    public String get_grade(double avg) {
        String grade = "";
        
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80 && avg < 90) {
            grade = "B";
        } else if (avg >= 70 && avg < 80) {
            grade = "C";
        } else if (avg >= 50 && avg < 70) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        return grade;
    }
}