package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.28
 * Title : 윤년 (https://www.acmicpc.net/problem/2753)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int is_year = 0;
        
        if(year%4 == 0 && year%100 != 0) {
            is_year = 1;
        }
        if(year%400 == 0) {
            is_year = 1;
        }
        
        System.out.println(is_year);
    }
}