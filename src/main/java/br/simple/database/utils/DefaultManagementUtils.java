package br.simple.database.utils;

import br.simple.database.domain.Details;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DefaultManagementUtils {

    public static void inputInFile() {

        try {

            Details personDetails1 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Ane").idade("30 anos").build();
            Details personDetails2 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Alice").idade("5 anos").build();
            Details personDetails3 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Guilherme").idade("29 anos").build();
            Details personDetails4 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("test").idade("29 anos").build();
            Details personDetails5 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("tes2t").idade("29 anos").build();


            Map<String, Details> map = new HashMap<>();

            map.put(personDetails1.getIdPessoa(), personDetails1);
            map.put(personDetails2.getIdPessoa(), personDetails2);
            map.put(personDetails3.getIdPessoa(), personDetails3);
            map.put(personDetails4.getIdPessoa(), personDetails4);
            map.put(personDetails5.getIdPessoa(), personDetails5);


            new ObjectMapper().writeValue(Paths.get(getFile().toString()).toFile(), map);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Map getContent() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(getFile(), Map.class);

    }

    public static File getFile() {
        return new File("C:\\Users\\greic\\Downloads\\simple-database\\src\\main\\resources\\files\\database.json");
    }
}
