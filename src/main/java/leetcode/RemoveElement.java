package leetcode;
/**
 * Date : 2020.10.02
 * Title : Remove Element (https://leetcode.com/problems/remove-element/)
 * Difficulty : Easy
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
