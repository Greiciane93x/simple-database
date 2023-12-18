package br.simple.database.files;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

import static br.simple.database.utils.DefaultManagementUtils.getContent;
import static br.simple.database.utils.DefaultManagementUtils.getFile;

public class Delete {

    public static void main(String[] args) {

        try{

            Map content = getContent();

            content.remove("e7287b40-2073-470e-9a62-95991bc371ff");

            new ObjectMapper().writeValue(Paths.get(getFile().toString()).toFile(), content);

            System.out.println("** -- REMOVE -- **");

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
