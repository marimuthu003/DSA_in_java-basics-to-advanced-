package Hashmap;

import java.util.HashSet;

class SudokuValidator {
    public boolean isValidSudoku(char[][] board) {
        // Validate rows
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char item = board[i][j];
                if (item != '.') {
                    if (set.contains(item)) {
                        return false;
                    } else {
                        set.add(item);
                    }
                }
            }
        }

        // Validate columns
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char item = board[j][i];
                if (item != '.') {
                    if (set.contains(item)) {
                        return false;
                    } else {
                        set.add(item);
                    }
                }
            }
        }

        // Validate 3x3 sub-boxes
        int[][] starts = {{0,0},{0,3},{0,6},{3,0},{3,3},{3,6},{6,0},{6,3},{6,6}};
        for (int[] start : starts) {
            HashSet<Character> set = new HashSet<>();
            for (int row = start[0]; row < start[0] + 3; row++) {
                for (int col = start[1]; col < start[1] + 3; col++) {
                    char item = board[row][col];
                    if (item != '.') {
                        if (set.contains(item)) {
                            return false;
                        } else {
                            set.add(item);
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        SudokuValidator validator = new SudokuValidator();
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validator.isValidSudoku(board));
    }
}

