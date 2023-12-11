package br.simple.database.files;


import br.simple.database.utils.Generic;

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

            writeInFile(new Generic<>(inputInFile()), fileOutputStream);

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
