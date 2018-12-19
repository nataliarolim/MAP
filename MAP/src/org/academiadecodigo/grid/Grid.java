package org.academiadecodigo.grid;

import org.academiadecodigo.player.Cursor;
import org.academiadecodigo.player.CursorMovement;

public class Grid {


    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;

    private int cols;
    private int rows;
    private Cell[][] cells;
    private Cursor cursor;
    private CursorMovement cursorMovement;


    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        //cursor = new Cursor(this);
        //cursorMovement = new CursorMovement(cursor);


        cells = new Cell[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                Cell cell = new Cell(col, row);
                cells[row][col] = cell;

            }
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

}
