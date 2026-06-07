package BinarySearchProblems;

/*
Problem:
74. Search A 2D Matrix

Given a matrix with sorted rows,
search target efficiently.

Approach:
Treat matrix as a sorted 1D array.

row = mid / cols
col = mid % cols

Time Complexity: O(log(m*n))
Space Complexity: O(1)
*/

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix,
                                int target) {

        int rows = matrix.length;

        int cols = matrix[0].length;

        int left = 0;

        int right = rows * cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int row = mid / cols;

            int col = mid % cols;

            if (matrix[row][col] == target) {

                return true;
            }

            if (matrix[row][col] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return false;
    }
}