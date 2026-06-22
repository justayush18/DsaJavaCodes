import java.util.HashSet;

public class Glass {

    private static final int SIZE = 9;

    static HashSet<Integer>[] rowSet = new HashSet[SIZE];
    static HashSet<Integer>[] colSet = new HashSet[SIZE];
    static HashSet<Integer>[] gridSet = new HashSet[SIZE];

    public static void initializeSets(int[][] sudoku) {

        for (int i = 0; i < SIZE; i++) {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();
        }

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {

                int num = sudoku[r][c];

                if (num != 0) {
                    rowSet[r].add(num);
                    colSet[c].add(num);

                    int gridIndex = (r / 3) * 3 + (c / 3);
                    gridSet[gridIndex].add(num);
                }
            }
        }
    }

    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {

        if (row == SIZE) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == SIZE) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        int gridIndex = (row / 3) * 3 + (col / 3);

        for (int digit = 1; digit <= 9; digit++) {

            if (!rowSet[row].contains(digit) &&
                    !colSet[col].contains(digit) &&
                    !gridSet[gridIndex].contains(digit)) {

                sudoku[row][col] = digit;

                rowSet[row].add(digit);
                colSet[col].add(digit);
                gridSet[gridIndex].add(digit);

                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }

                sudoku[row][col] = 0;

                rowSet[row].remove(digit);
                colSet[col].remove(digit);
                gridSet[gridIndex].remove(digit);
            }
        }

        return false;
    }

    public static void printSudoku(int[][] sudoku) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] sudoku = {
                {0, 0, 8, 0, 0, 0, 0, 0, 0},
                {4, 9, 0, 1, 5, 7, 0, 0, 2},
                {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0},
                {0, 0, 0, 0, 2, 0, 0, 6, 0},
                {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4},
                {0, 4, 9, 0, 3, 0, 0, 5, 7},
                {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        initializeSets(sudoku);

        if (sudokuSolver(sudoku, 0, 0)) {
            printSudoku(sudoku);
        } else {
            System.out.println("Solution Does Not Exist");
        }
    }
}