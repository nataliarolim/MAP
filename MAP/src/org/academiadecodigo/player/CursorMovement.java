package org.academiadecodigo.player;

import org.academiadecodigo.Directions;
import org.academiadecodigo.grid.FileManager;
import org.academiadecodigo.grid.Grid;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class CursorMovement implements KeyboardHandler {

    private Keyboard keyboard;
    private Cursor cursor;
    private FileManager fileManager;
    private Grid grid;


    public CursorMovement(Cursor cursor, FileManager fileManager) {
        this.fileManager = fileManager;
        this.cursor = cursor;
        keyboard = new Keyboard(this);
        init();

    }

    public void init() {


        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent save = new KeyboardEvent();
        save.setKey(KeyboardEvent.KEY_S);
        save.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent load = new KeyboardEvent();
        load.setKey(KeyboardEvent.KEY_L);
        load.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(space);
        keyboard.addEventListener(save);
        keyboard.addEventListener(load);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_RIGHT:

                cursor.move(Directions.RIGTH);
                break;

            case KeyboardEvent.KEY_LEFT:
                cursor.move(Directions.LEFT);
                break;

            case KeyboardEvent.KEY_DOWN:
                cursor.move(Directions.DOWN);
                break;

            case KeyboardEvent.KEY_UP:
                cursor.move(Directions.UP);
                break;

            case KeyboardEvent.KEY_SPACE:
                cursor.move(Directions.SPACE);
                break;

            case KeyboardEvent.KEY_S:
                fileManager.saveFile();
                break;

            case KeyboardEvent.KEY_L:
                System.out.println("load");
                fileManager.loadFile();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

}



