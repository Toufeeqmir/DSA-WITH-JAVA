
public class sudoku {

    public static boolean sudokusolver(int sodoku[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextrow = row, nextcol = col + 1;

        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (sodoku[row][col] != 0) {
            return sudokusolver(sodoku, nextrow, nextcol);

        }
        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sodoku, row, col, digit)) {
                sodoku[row][col] = digit;

                if (sudokusolver(sodoku, nextrow, nextcol)) {
                    return true;
                }
            }
            sodoku[row][col] = 0;

        }
        return false;

    }

    public static boolean issafe(int sodoku[][], int row, int col, int digit) {
        //column
        for (int i = 0; i <= 8; i++) {
            if (sodoku[i][col] == digit) {
                return false;
            }

        }
        for (int j = 0; j <= 8; j++) {
            if (sodoku[row][j] == digit) {
                return false;
            }
        }
        //Grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sodoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printsudoku(int sodoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sodoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sodoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
        { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
        { 8, 2, 7, 0, 0, 9, 0, 1, 3 }};
        if (sudokusolver(sodoku, 0, 0)) {
            System.out.println("solution exist");
            printsudoku(sodoku);
        } else {
            System.out.println("solution does not exist");
        }

    }

}
