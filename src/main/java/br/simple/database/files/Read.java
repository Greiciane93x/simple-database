package br.simple.database.files;

import br.simple.database.domain.Details;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static br.simple.database.utils.DefaultManagementUtils.getContent;
import static br.simple.database.utils.DefaultManagementUtils.getFile;


public class Read {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        Map content = getContent();

        Map<String, Details> detailsMap = new HashMap<>();

        Details personDetails6 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("tes2t").idade("29 anos").build();

        Details put = detailsMap.put(personDetails6.getIdPessoa(), personDetails6);

        objectMapper.writeValue(getFile(), put);

        System.out.println(content);


    }
}
