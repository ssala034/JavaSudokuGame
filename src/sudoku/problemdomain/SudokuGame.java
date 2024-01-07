package sudoku.problemdomain;

import sudoku.computationlogic.SudokuUtilities;
import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int [][] gridState;
    public static final int GRID_BOUNDARY = 9;


    public SudokuGame(GameState gameState, int [][] gridState){
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {

        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
        // create a class that will have a method that create a copy of array
    }

}
