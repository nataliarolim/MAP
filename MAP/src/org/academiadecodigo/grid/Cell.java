package org.academiadecodigo.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private Rectangle cellGfx;
    private boolean paintCell = false;
    private int col;
    private int row;


    public Cell( int col, int row) {

        this.col = col;
        this.row = row;


        cellGfx = new Rectangle(Grid.PADDING + (Grid.CELL_SIZE * col), Grid.PADDING + (Grid.CELL_SIZE * row), Grid.CELL_SIZE , Grid.CELL_SIZE );
        cellGfx.draw();
    }


    public boolean isPaint() {
        return paintCell;
    }


    public void paint() {
        paintCell = true;
        cellGfx.setColor(Color.BLACK);
        cellGfx.fill();


    }

    public void erase() {
        cellGfx.draw();
    }

}




