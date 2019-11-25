package org.sudoku;

import org.assertj.core.api.ArraySortedAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {
    private Sudoku sudoku;

    @BeforeEach
    void setUp() {
        sudoku = new Sudoku();
    }

    @Test
    void should_contains_all_numbers_from_one_to_nine() {
        List<Integer> sudokuCell = Arrays.asList(0, 0, 6, 0, 0, 0, 0, 0, 0);
        assertEquals(9, sudokuCell.size());
        List<Integer> cellSolved =sudoku.solveCell(sudokuCell);
        assertEquals(6, cellSolved.get(2));
        assertTrue(cellSolved.containsAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)), cellSolved.toString());
    }
}