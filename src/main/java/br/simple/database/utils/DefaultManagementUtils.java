package br.simple.database.utils;

import br.simple.database.domain.Details;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DefaultManagementUtils {


    public static Details mockDetails() throws IOException {
        Details personDetails = new Details.Builder().idPessoa("e7287b40-2073-470e-9a62-4444444444").nome("Anexxxxx").idade("30 anos").build();
        return personDetails;

    }



    public static Map getContent() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(getFile(), Map.class);

    }

    public static File getFile() {
        return new File("C:\\Users\\greic\\Downloads\\simple-database\\src\\main\\resources\\files\\database.json");
    }
}
