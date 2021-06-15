package leetcode;
/**
 * Date : 2021.06.15
 * Title : Merge Sorted Array (https://leetcode.com/problems/merge-sorted-array/)
 * Difficulty : Easy
 */
import java.util.*;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = m; j < m+n; j++) {
            nums1[j] = nums2[j-m];
        }
        
        Arrays.sort(nums1);
    }
}
