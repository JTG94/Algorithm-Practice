package programmers;
import java.util.*;

/**
 * Date : 2021.06.21
 * Title : JadenCase 문자열 만들기 (https://programmers.co.kr/learn/courses/30/lessons/12951)
 * Difficulty : Level 2
 */
 public class PM_level2_JadenCase문자열만들기 {
    public String solution(String s) {
        StringBuilder JadenCase_String = new StringBuilder();
        
        String first_string = s.substring(0, 1);
        
        if (first_string.matches("^[a-z]*$")) {
            JadenCase_String.append(first_string.toUpperCase());
        } else {
            JadenCase_String.append(first_string);
        }
        
        boolean word_flag = true;
        for(int i = 1; i < s.length(); i++) {
            String sub_string = s.substring(i, i+1);
            
            if (word_flag && sub_string.matches("^[A-Z]*$")) {
                sub_string = sub_string.toLowerCase();
            }
            
            if (!word_flag) {
                if (sub_string.matches("^[a-z]*$")) {
                    sub_string = sub_string.toUpperCase();
                }
                word_flag = true;
            }
            
            
            if (sub_string.equals(" ")) {
                word_flag = false;
            }
            JadenCase_String.append(sub_string);
        }
        return JadenCase_String.toString();
    }
 }