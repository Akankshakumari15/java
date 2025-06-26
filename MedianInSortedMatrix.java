public class MedianInSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = { {1, 3, 5}, {2, 6, 9},{3, 6, 9}  };
        System.out.println("Median is: " + findMedian(mat));
    }
    public static int findMedian(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        int low = 1, high = 2000; 
        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;
            for (int[] row : mat)
                count += countLE(row, mid);
            if (count < (r * c + 1) / 2)
                low = mid + 1;
            else
                high = mid;
        }   return low;
    }
    static int countLE(int[] row, int val) {
        int l = 0, h = row.length;
        while (l < h) {
            int m = (l + h) / 2;
            if (row[m] <= val)
                l = m + 1;
            else
                h = m;
        }   return l;
    }
}


