public class SudokuSolver {
    //isSafe>row>col>gird
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        //row
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        //column
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        //grid of 3X3
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    //sudokuSolver>base>next>setNumber>core
    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        //base
        if (row == 9) {
            return true;
        }
        //next row and col
        int nextCol = col + 1, nextRow = row;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        //already present element
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        //core or placing digit
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) { // solution exist
                sudoku[row][col] = digit;

                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }


    //Sudoku print
    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku =
                {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                        {4, 9, 0, 1, 5, 7, 0, 0, 2},
                        {0, 0, 3, 0, 0, 4, 1, 9, 0},
                        {1, 8, 5, 0, 6, 0, 0, 2, 0},
                        {0, 0, 0, 0, 2, 0, 0, 6, 0},
                        {9, 6, 0, 4, 0, 5, 3, 0, 0},
                        {0, 3, 0, 0, 7, 2, 0, 0, 4},
                        {0, 4, 9, 0, 3, 0, 0, 5, 7},
                        {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if ((sudokuSolver(sudoku, 0, 0))) {
            printSudoku(sudoku);
        } else {
            System.out.println("Solution Does Not Exist");
        }
    }
}

//        2 1 8 3 9 6 7 4 5
//        4 9 6 1 5 7 8 3 2
//        7 5 3 2 8 4 1 9 6
//        1 8 5 7 6 3 4 2 9
//        3 7 4 9 2 8 5 6 1
//        9 6 2 4 1 5 3 7 8
//        5 3 1 6 7 2 9 8 4
//        6 4 9 8 3 1 2 5 7
//        8 2 7 5 4 9 6 1 3


