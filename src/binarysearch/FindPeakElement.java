package BinarySearchProblems;

/*
Problem:
162. Find Peak Element

A peak element is greater than its neighbors.

Approach:
1. Compare middle element with next element.
2. If descending, peak lies on left side.
3. If ascending, peak lies on right side.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class FindPeakElement {

    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {

                right = mid;

            } else {

                left = mid + 1;
            }
        }

        return left;
    }
}