package br.simple.database.files;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

import static br.simple.database.utils.DefaultManagementUtils.*;


public class Insert {
    public static void main(String[] args) throws IOException {

        Map content = getContent();

        content.put("e7287b40-2073-470e-9a62-5555555555", mockDetailsInsert());

        new ObjectMapper().writeValue(Paths.get(getFile().toString()).toFile(), content);

        System.out.println("** -- INSERT -- **");


    }
}
