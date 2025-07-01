public class BooleanMatrixProblem_SetTo1 {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };
        setZeroes(mat);
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
    static void setZeroes(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];
        // rows and columns that have a 1
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
        // Set entire row to 1 
        for (int i = 0; i < r; i++)
            if (row[i])
                for (int j = 0; j < c; j++)
                    mat[i][j] = 1;
        // Set entire column to 1 
        for (int j = 0; j < c; j++)
            if (col[j])
                for (int i = 0; i < r; i++)
                    mat[i][j] = 1;
    }
}




