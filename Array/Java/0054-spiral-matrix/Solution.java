import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int up = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;

        while (left <= right && up <= bottom) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            up++;

            for (int i = up; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (left > right || up > bottom) {
                break;
            }

            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            bottom--;

            for (int i = bottom; i >= up; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
