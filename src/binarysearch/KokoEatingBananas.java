package BinarySearchProblems;

/*
Problem:
875. Koko Eating Bananas

Find the minimum eating speed such that
Koko can finish all bananas within h hours.

Approach:
1. Binary search eating speed.
2. Check total hours needed for current speed.
3. Minimize valid speed.

Time Complexity: O(n log maxPile)
Space Complexity: O(1)
*/

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for (int pile : piles) {

            right = Math.max(right, pile);
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canEat(piles, h, mid)) {

                right = mid;

            } else {

                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canEat(int[] piles,
                           int h,
                           int speed) {

        int hours = 0;

        for (int pile : piles) {

            hours += Math.ceil((double) pile / speed);
        }

        return hours <= h;
    }
}