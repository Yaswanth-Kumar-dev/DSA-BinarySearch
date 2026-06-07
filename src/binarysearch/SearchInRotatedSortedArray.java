package BinarySearchProblems;

/*
Problem:
33. Search In Rotated Sorted Array

Search target in rotated sorted array.

Approach:
1. One side is always sorted.
2. Check which side is sorted.
3. Decide where target lies.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int left = 0;

        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                return mid;
            }

            if (nums[left] <= nums[mid]) {

                if (target >= nums[left]
                        && target < nums[mid]) {

                    right = mid - 1;

                } else {

                    left = mid + 1;
                }

            } else {

                if (target > nums[mid]
                        && target <= nums[right]) {

                    left = mid + 1;

                } else {

                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}