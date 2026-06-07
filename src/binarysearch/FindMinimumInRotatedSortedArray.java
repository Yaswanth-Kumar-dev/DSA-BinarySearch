package BinarySearchProblems;

/*
Problem:
153. Find Minimum In Rotated Sorted Array

Given a rotated sorted array without duplicates,
find the minimum element.

Approach:
1. Compare middle element with right.
2. Minimum lies in unsorted half.
3. Continue binary search.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {

                left = mid + 1;

            } else {

                right = mid;
            }
        }

        return nums[left];
    }
}