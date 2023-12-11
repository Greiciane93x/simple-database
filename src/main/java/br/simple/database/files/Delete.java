package br.simple.database.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import static br.simple.database.utils.DefaultManagementUtils.getFile;
import static br.simple.database.utils.DefaultManagementUtils.inputInFile;

public class Delete {

    public static void main(String[] args) {

        try{
            List<String> collect = Files.lines(
                    getFile().toPath()).filter(
                    line -> !line.contains(inputInFile().toString())).collect(Collectors.toList());

            Files.write(getFile().toPath(), collect, StandardOpenOption.WRITE, StandardOpenOption.DELETE_ON_CLOSE);

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
