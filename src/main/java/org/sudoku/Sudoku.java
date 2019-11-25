package org.sudoku;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sudoku {


    public Integer[][] solve(int[][] gridToSolve) {
        return null;
    }

    public List<Integer> solveCell(List<Integer> sudokuCell) {
        List<Integer> result = new ArrayList<>();
        int sudukoNumber = 1;
        for (int index = 1;index < 10; index++) {
            if (sudokuCell.get(index - 1) == 0 && !sudokuCell.contains(index)) {
                result.add(sudukoNumber);
                sudukoNumber++;
            } else {
                result.add(sudokuCell.get(index - 1));
            }
        }

        return result;
    }


}
