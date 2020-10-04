package leetcode;
/**
 * Date : 2020.10.04
 * Title : Remove Duplicates from Sorted Array (https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 * Difficulty : Easy
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[index] = nums[i+1];
                index++;
            }
        }

        return index;
    }
}
