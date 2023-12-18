package br.simple.database.files;

import java.io.IOException;
import java.util.Map;

import static br.simple.database.utils.DefaultManagementUtils.getContent;


public class Read {

    public static void main(String[] args) throws IOException {

        Map content = getContent();

        System.out.println(content);

        System.out.println("** -- READ -- **");
    }
}
