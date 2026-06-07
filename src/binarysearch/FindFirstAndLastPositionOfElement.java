package BinarySearchProblems;

/*
Problem:
34. Find First And Last Position Of Element

Given a sorted array nums,
find the starting and ending position of target.

Approach:
1. Binary search for first occurrence.
2. Binary search for last occurrence.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class FindFirstAndLastPositionOfElement {

    public int[] searchRange(int[] nums, int target) {

        return new int[]{
                findFirst(nums, target),
                findLast(nums, target)
        };
    }

    private int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                result = mid;

                right = mid - 1;

            } else if (nums[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return result;
    }

    private int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                result = mid;

                left = mid + 1;

            } else if (nums[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return result;
    }
}