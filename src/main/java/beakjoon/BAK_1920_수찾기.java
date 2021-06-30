package beakjoon;
import java.util.*;

/**
 * Date : 2021.06.30
 * Title : 수 찾기 (https://www.acmicpc.net/problem/1920)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        Arrays.sort(arr);
        
        int M = sc.nextInt();
        int[] findArr = new int[M];
        for (int i = 0; i < M; i++) {
            findArr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < M; i++) {
            System.out.println(binarySearch(arr, findArr[i]));
        }
    }
    
    public static int binarySearch(int[] arr, int targetNum) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while(low <= high) {
            mid = (low + high) / 2;
            
            if (arr[mid] == targetNum) {
                return 1;
            } else if (targetNum > arr[mid]) {
                low = mid+1;
            } else if (targetNum < arr[mid]) {
                high = mid-1;
            }
        }
        
        return 0;
    }
}