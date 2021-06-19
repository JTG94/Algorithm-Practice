package programmers;
import java.util.*;

/**
 * Date : 2021.06.19
 * Title : [1차] 뉴스 클러스터링 (https://programmers.co.kr/learn/courses/30/lessons/17677)
 * Difficulty : Level 2
 */
 public class PM_level2_[1차]뉴스클러스터링 {
    public int solution(String str1, String str2) {
        double answer = 0;
        ArrayList<String> al_str1 = changeValidStrPair(str1);
        ArrayList<String> al_str2 = changeValidStrPair(str2);
        
        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        
        for (int i = 0; i < al_str1.size(); i++) {
            if (al_str2.remove(al_str1.get(i))) {
                intersection.add(al_str1.get(i));
            }
            union.add(al_str1.get(i));
        }
        
        for (int j = 0; j < al_str2.size(); j++) {
            union.add(al_str2.get(j));
        }
        
        if (union.size() == 0) {
            answer = 1;
        } else {
            answer = (double)intersection.size() / (double)union.size();
        }
        
        return (int)(answer * 65536);
    }
    
    public ArrayList<String> changeValidStrPair(String str) {
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < str.length() - 1; i++) {
            String substr = str.substring(i, i+2).toLowerCase();
            if (substr.matches("^[a-z]*$")) {
                result.add(substr);
            }
        }
        
        return result;
    }
 }