public class MaximumAreaRectangleOf1s {
     public static void main(String[] args) {
        int[][] mat = {  {0, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 0, 0}  };

        int rows = mat.length, cols = mat[0].length;
        int[] height = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1)
                    height[j]++;
                else
                    height[j] = 0;
            }
            for (int j = 0; j < cols; j++) {
                int h = height[j];
                int width = 1;

                for (int k = j - 1; k >= 0 && height[k] >= h; k--) width++;
                for (int k = j + 1; k < cols && height[k] >= h; k++) width++;

                int area = h * width;
                if (area > maxArea) maxArea = area;
            }
        }
        System.out.println("Maximum area of rectangle of 1s: " + maxArea);
    }
}
