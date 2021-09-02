package udemycourse;

public class NQueenProblem {

    public static void isValid() {

    }

    public static boolean nQueen(int boardSize, int[][] board, int index) {
        if(index >= boardSize) {
            return true;
        }
        for(int i = 0; i < boardSize; i++) {
            if (isValid(i, board, index) == true) {
                board[i][index] = 1;
                if(nQueen(boardSize, board, index+1) == true) {
                    return true;
                }
                board[i][index] = 0;

            }

        }
        return false;
    }

    public static boolean isValid(int row, int[][] board, int col) {

        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < 4; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int boardSize = 4;
        int[][] board = new int[boardSize][boardSize];
        nQueen(boardSize, board,0);

    }
}
