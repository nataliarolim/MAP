package org.academiadecodigo.grid;

import java.io.*;

public class FileManager {

    private Grid grid;


    //private FileInputStream fileInputStream;
    private FileOutputStream fileOutputStream;


    public FileManager(Grid grid) {
        this.grid = grid;
        try {
            //fileInputStream = new FileInputStream("resources/save");
            fileOutputStream = new FileOutputStream("resources/save");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    public void saveFile() {


        String fileGrid = "";

        try {
            for (int row = 0; row < grid.getRows(); row++) {
                for (int col = 0; col < grid.getCols(); col++) {

                    if (!grid.getCell(row, col).isPaint()) {
                        fileGrid += "0";
                    } else {
                        fileGrid += "1";

                    }
                }
                fileGrid += "\n";
            }

            for (int i = 0; i < fileGrid.length(); i++) {

                fileOutputStream.write(fileGrid.charAt(i));

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String loadFile() {

        BufferedReader bReader = null;
        String result = "";

        try {

        /*for (int row = 0; row < grid.getRows(); row++) {
            for (int col = 0; col < grid.getCols(); col++) {

                if (!grid.getCell(row, col).isPaint()) {
                    result += "0";
                } else {
                    result += "1";
*/

            bReader = new BufferedReader(new FileReader("resources/save"));
            String line;

            while ((line = bReader.readLine()) != null) {
                result += line + "\n";
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bReader.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(result);

        return result;
    }
}


