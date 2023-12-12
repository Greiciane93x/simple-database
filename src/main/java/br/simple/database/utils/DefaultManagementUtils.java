package br.simple.database.utils;

import br.simple.database.domain.Details;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DefaultManagementUtils {

    public static String inputInFile() throws IOException {
//
//        Details personDetails1 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Ane").idade("30 anos").build();
//        Details personDetails2 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Alice").idade("5 anos").build();
//        Details personDetails3 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Guilherme").idade("29 anos").build();
        Details personDetails5 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("test").idade("29 anos").build();

        Map<String, Details> map = new HashMap<>();
        /*map.put(personDetails1.getIdPessoa(), personDetails1);
        map.put(personDetails2.getIdPessoa(), personDetails2);
        map.put(personDetails3.getIdPessoa(), personDetails3);*/
        map.put(personDetails5.getIdPessoa(), personDetails5);


        String json = new ObjectMapper().writeValueAsString(map);

        return json;
    }

    public static void writeInFile() throws IOException {

        try(FileWriter fileWriter = new FileWriter(getFile(), true)){
            fileWriter.write(inputInFile());
        }


        /*byte[] b = json.getGeneric().getBytes();
        fileOutputStream.write(b);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("File writing done. ");*/
    }

//
//    public static void appendWriteToJson() {
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            // Object to JSON in file
//            JsonDaoImpl js = new JsonDaoImpl();
//            URL resourceUrl = js.getClass().getResource("/data/actionbean.json");
//            System.out.println(resourceUrl);
//            File file = new File(resourceUrl.toURI());
//
//            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true))); // append mode file writer
//
//            mapper.writeValue(out, DummyBeanObject);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }




    public static File getFile(){
        return new File("C:\\Users\\greic\\Downloads\\simple-database\\src\\main\\resources\\files\\database.json");
    }
}
