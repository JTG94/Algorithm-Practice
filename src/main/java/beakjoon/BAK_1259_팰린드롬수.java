package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.29
 * Title : 팰린드롬수 (https://www.acmicpc.net/problem/1259)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        while(true) {
            int input = sc.nextInt();
            if (input == 0) {
                return;
            }
            
            String s = Integer.toString(input);
            String result = "no";
            int cnt = 0;
            for (int i = 0; i < s.length()/2; i++) {
                if(s.charAt(i) == s.charAt(s.length()-i-1)) {
                    cnt++;
                }
            }
            if (cnt == s.length()/2) result = "yes";
            
            System.out.println(result);
        }   
    }
}