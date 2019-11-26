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


    public boolean isExistInCell(int numberToFind, int[][] gridToSolve, int cellIndex) {
        for(int i=0; i < 3; i++){
            for(int j=0; j < 3; j++){
                if(gridToSolve[i][j] == numberToFind) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isExistInRow(int numberToFind, int[][] gridToSolve, int rowIndex) {
        for(int i=0; i < gridToSolve[rowIndex].length;i++){
            if(gridToSolve[rowIndex][i] == numberToFind){
                return true;
            }
        }
        return false;
    }
}
