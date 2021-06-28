package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.28
 * Title : 알람 시계 (https://www.acmicpc.net/problem/2884)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int mimute = sc.nextInt();
        
        int before_hour = hour;
        int before_min = mimute - 45;
       
        if (before_min < 0) {
            before_min = 60 + before_min;
            
            if (before_hour == 0) {
                before_hour = 23;
            } else {
                before_hour -= 1;
            }
        }
        
        System.out.println(before_hour);
        System.out.println(before_min);
    }
}