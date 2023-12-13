package br.simple.database.files;


import java.io.File;
import java.io.FileOutputStream;

import static br.simple.database.utils.DefaultManagementUtils.*;


public class Insert {
    public static void main(String[] args) {
        File file =  null;
        FileOutputStream fileOutputStream = null;

        try {

            fileOutputStream = new FileOutputStream(getFile());

            if(!getFile().exists()) file.createNewFile();

            inputInFile();

          /*  writeInFile();*/

            System.out.println("Adding data... ");

        }catch (Exception e){
            e.getStackTrace();
        }finally {
            try{
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
