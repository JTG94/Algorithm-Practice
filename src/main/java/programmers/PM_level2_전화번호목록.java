package programmers;
import java.util.*;

/**
 * Date : 2020.10.17
 * Title : 전화번호 목록 (https://programmers.co.kr/learn/courses/30/lessons/42577)
 * Difficulty : Level 2
 */
public class PM_level2_전화번호목록 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
        return true;
    }
}
