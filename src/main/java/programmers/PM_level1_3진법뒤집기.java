package programmers;

/**
 * Date : 2021.08.01
 * Title : 3진법 뒤집기
 * Difficulty : Level 1
 */
class PM_level1_3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            sb.insert(0, n % 3);
            n /= 3;
        }
        
        String reverse = sb.reverse().toString();
        
        answer = Integer.parseInt(reverse, 3);
        
        return answer;
    }
}