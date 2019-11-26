package org.sudoku;

import org.assertj.core.api.ArraySortedAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {
    private Sudoku sudoku;
    private int[][] gridToSolve = {
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


    @BeforeEach
    void setUp() {
        sudoku = new Sudoku();
    }

    @Test
    @Disabled
    void should_contains_all_numbers_from_one_to_nine() {
        List<Integer> sudokuCell = Arrays.asList(0, 0, 6, 0, 0, 0, 0, 0, 0);
        assertEquals(9, sudokuCell.size());
        List<Integer> cellSolved = sudoku.solveCell(sudokuCell);
        assertEquals(6, cellSolved.get(2));
        assertTrue(cellSolved.containsAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)), cellSolved.toString());
    }

    @Test
    void should_return_false_if_number_doesnt_exist() {
        boolean isExist = sudoku.isExistInCell(2, gridToSolve, 0);
        assertFalse(isExist);
    }

    @Test
    void should_return_true_if_number_exists() {
        boolean isExist = sudoku.isExistInCell(6, gridToSolve, 0);
        assertTrue(isExist);
    }

    @Test
    void should_return_true_if_number_exists_in_row() {
        boolean isExist = sudoku.isExistInRow(2, gridToSolve, 0);
        assertTrue(isExist);
    }

    @Test
    void should_return_false_if_number_doesnt_exists_in_row() {
        boolean isExist = sudoku.isExistInRow(8, gridToSolve, 0);
        assertFalse(isExist);
    }



}