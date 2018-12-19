package org.academiadecodigo;

import org.academiadecodigo.grid.FileManager;
import org.academiadecodigo.grid.Grid;
import org.academiadecodigo.player.Cursor;
import org.academiadecodigo.player.CursorMovement;

public class Main {

    public static void main(String[] args) {

        Grid g = new Grid(25,25);

        FileManager fm = new FileManager(g);
        //fm.loadFile();


        Cursor cursor = new Cursor(g);
        //CursorMovement cursorMovement = new CursorMovement(cursor,fm);
        CursorMovement cursorMovement = new CursorMovement(cursor,fm);





    }
}
