package binarysearch;

/*
Problem:
1011. Capacity To Ship Packages Within D Days

Given an array of package weights and number of days,
find the least weight capacity of the ship.

Approach:
1. Minimum capacity = maximum weight.
2. Maximum capacity = sum of all weights.
3. Binary search the answer.
4. Check if current capacity can ship within given days.

Time Complexity: O(n log(sum))
Space Complexity: O(1)
*/

public class CapacityToShipPackagesWithinDDays {

    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int weight : weights) {

            left = Math.max(left, weight);

            right += weight;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {

                right = mid;

            } else {

                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canShip(int[] weights,
                            int days,
                            int capacity) {

        int currentWeight = 0;
        int requiredDays = 1;

        for (int weight : weights) {

            if (currentWeight + weight > capacity) {

                requiredDays++;

                currentWeight = 0;
            }

            currentWeight += weight;
        }

        return requiredDays <= days;
    }
}