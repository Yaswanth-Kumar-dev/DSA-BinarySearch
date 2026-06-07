package BinarySearchProblems;

import java.util.Arrays;

/*
Problem:
719. Find K-th Smallest Pair Distance

Approach:
1. Sort array.
2. Binary search distance.
3. Count pairs with distance <= mid.

Time Complexity: O(n log(maxDistance))
Space Complexity: O(1)
*/

public class FindKthSmallestPairDistance {

    public int smallestDistancePair(int[] nums, int k) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums[nums.length - 1] - nums[0];

        while (left < right) {

            int mid = left + (right - left) / 2;

            int count = countPairs(nums, mid);

            if (count >= k) {

                right = mid;

            } else {

                left = mid + 1;
            }
        }

        return left;
    }

    private int countPairs(int[] nums,
                           int distance) {

        int count = 0;
        int left = 0;

        for (int right = 0;
             right < nums.length;
             right++) {

            while (nums[right] - nums[left]
                    > distance) {

                left++;
            }

            count += right - left;
        }

        return count;
    }
}