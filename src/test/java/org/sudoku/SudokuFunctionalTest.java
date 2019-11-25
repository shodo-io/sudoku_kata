package org.sudoku;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SudokuFunctionalTest {

    @Test
    @Disabled
    public void name() {
        int[][] gridToSolve = {
                {0, 0, 6, 0, 0, 0, 0, 0, 0},
                {2, 9, 0, 0, 8, 6, 0, 7, 0},
                {3, 4, 0, 0, 9, 2, 0, 0, 1},
                {1, 0, 0, 0, 0, 8, 0, 9, 0},
                {0, 0, 8, 0, 2, 0, 1, 0, 0},
                {0, 7, 0, 1, 0, 0, 0, 0, 8},
                {7, 0, 0, 5, 1, 0, 0, 6, 4},
                {0, 3, 0, 8, 4, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

        Sudoku sudoku = new Sudoku();
        Integer[][] result = sudoku.solve(gridToSolve);
        int[][] expectedGrid = {
                {8, 5, 6, 3, 7, 1, 2, 4, 9},
                {2, 9, 1, 4, 8, 6, 5, 7, 3},
                {3, 4, 7, 5, 9, 2, 6, 8, 1},
                {1, 2, 5, 4, 3, 8, 6, 9, 7},
                {3, 6, 8, 9, 2, 7, 1, 5, 4},
                {4, 7, 9, 1, 6, 5, 2, 3, 8},
                {7, 8, 2, 5, 1, 3, 9, 6, 4},
                {6, 3, 5, 8, 4, 9, 7, 1, 2},
                {9, 1, 4, 7, 2, 6, 8, 5, 3}
        };
        assertArrayEquals(expectedGrid, result);
    }
}
