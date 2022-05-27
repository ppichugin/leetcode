package topinterviewquestions.easy.array;

/*
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *  - Each row must contain the digits 1-9 without repetition.
 *  - Each column must contain the digits 1-9 without repetition.
 *  - Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * Note:
 * -- A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * -- Only the filled cells need to be validated according to the mentioned rules.
 *
 * Constraints:
 *   board.length == 9
 *   board[i].length == 9
 *   board[i][j] is a digit 1-9 or '.'.
 */

import java.util.HashSet;
import java.util.Set;

public class ValidSudokuMain {

    public static void main(String[] args) {
        ValidSudokuMain sudoku = new ValidSudokuMain();
        char[][] chars = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'} // first char = 5
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(sudoku.isValidSudoku(chars));
        chars = new char[][]{{'8', '3', '.', '.', '7', '.', '.', '.', '.'} // first char = 8
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(sudoku.isValidSudoku(chars));

    }

    public boolean isValidSudoku(char[][] board) {
        boolean result = true;
        Set<Character> setOfChars = new HashSet<>(9);
        char currentChar;
        for (char[] chars : board) {
            for (int column = 0; column < 9; column++) {
                currentChar = chars[column];
                if (currentChar == '.') continue;
                result = setOfChars.add(currentChar);
                if (!result) return result;
            }
            setOfChars = new HashSet<>(9);
        }
        for (int column = 0; column < 9; column++) {
            for (int row = 0; row < 9; row++) {
                currentChar = board[row][column];
                if (currentChar == '.') continue;
                result = setOfChars.add(currentChar);
                if (!result) return result;
            }
            setOfChars = new HashSet<>();
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        currentChar = board[i+k][j+l];
                        if (currentChar == '.') continue;
                        result = setOfChars.add(currentChar);
                        if (!result) return result;
                    }
                }
                setOfChars = new HashSet<>(9);
            }
        }
        return result;
    }
}
