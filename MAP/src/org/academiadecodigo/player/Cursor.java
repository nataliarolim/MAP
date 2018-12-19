package org.academiadecodigo.player;

import org.academiadecodigo.Directions;
import org.academiadecodigo.grid.FileManager;
import org.academiadecodigo.grid.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cursor {

    private Rectangle cursorGfx;
    private Grid grid;



    public Cursor(Grid grid) {
        this.grid = grid;
        cursorGfx = new Rectangle(Grid.PADDING, Grid.PADDING,Grid.CELL_SIZE ,Grid.CELL_SIZE );
        cursorGfx.fill();
        cursorGfx.setColor(Color.GREEN);

    }


    public void move(Directions direction) {

        switch (direction) {

            case DOWN:
                if (getRow() < grid.getCols() - 1) {
                    cursorGfx.translate(0, Grid.CELL_SIZE);

                }
                break;
            case UP:
                if (getRow() > 0) {
                    cursorGfx.translate(0, -Grid.CELL_SIZE);
                }
                break;

            case LEFT:
                if (getCol() > 0) {
                    cursorGfx.translate(-Grid.CELL_SIZE, 0);
                }
                break;
            case RIGTH:

                if (getCol() < grid.getRows() - 1) {
                    cursorGfx.translate(Grid.CELL_SIZE, 0);

                }
                break;

            case SPACE:

                    if(!grid.getCell(getRow(),getCol()).isPaint()){
                        grid.getCell(getRow(),getCol()).paint();
                }else {
                        grid.getCell(getRow(),getCol()).erase();
                    }
                }
        }



    public int getCol() { // saber a posição do cursorGfx  linha

        return (cursorGfx.getX() / Grid.CELL_SIZE);
    }


    public int getRow() {

        return (cursorGfx.getY() / Grid.CELL_SIZE);

    }


}
