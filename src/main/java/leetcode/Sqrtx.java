package leetcode;

/**
 * Date : 2021.06.26
 * Title : Sqrt(x) (https://leetcode.com/problems/sqrtx/submissions/)
 * Difficulty : Easy
 */
 public class Sqrtx {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int low = 1;
        int high = x;
        
        while (low <= high) {
            int mid = low + (high - low)/2;
            
            if (mid > x/mid) {
                high = mid - 1;
            } else {
                if (mid + 1 > x/ (mid+1)) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        
        return low;
    }
 }