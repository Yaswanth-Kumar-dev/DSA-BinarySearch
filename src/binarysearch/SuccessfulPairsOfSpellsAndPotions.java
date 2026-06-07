package BinarySearchProblems;

import java.util.Arrays;

/*
Problem:
2300. Successful Pairs Of Spells And Potions

Find number of successful pairs.

Approach:
1. Sort potions.
2. Binary search minimum valid potion.

Time Complexity: O(n log m)
Space Complexity: O(1)
*/

public class SuccessfulPairsOfSpellsAndPotions {

    public int[] successfulPairs(int[] spells,
                                 int[] potions,
                                 long success) {

        Arrays.sort(potions);

        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {

            int left = 0;
            int right = potions.length - 1;

            int index = potions.length;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                long product =
                        (long) spells[i] * potions[mid];

                if (product >= success) {

                    index = mid;
                    right = mid - 1;

                } else {

                    left = mid + 1;
                }
            }

            result[i] = potions.length - index;
        }

        return result;
    }
}