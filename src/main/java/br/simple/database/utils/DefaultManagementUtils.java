package br.simple.database.utils;

import br.simple.database.domain.Details;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SequenceWriter;

import java.io.*;
import java.util.*;

public class DefaultManagementUtils {

    public static void inputInFile() {

        try {

            Details personDetails7 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Ane").idade("30 anos").build();
//            Details personDetails2 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Alice").idade("5 anos").build();
//            Details personDetails3 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("Guilherme").idade("29 anos").build();
//            Details personDetails4 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("test").idade("29 anos").build();
//            Details personDetails6 = new Details.Builder().idPessoa(UUID.randomUUID().toString()).nome("tes2t").idade("29 anos").build();

            List<Details> detailsList = new ArrayList<>();

            detailsList.add(personDetails7);
//            detailsList.add(personDetails2);
//            detailsList.add(personDetails3);
//            detailsList.add(personDetails4);
//            detailsList.add(personDetails6);

            Map<String, List<Details>> map = new HashMap<>();
            map.put("data", detailsList);


            File file = new File("C:\\Users\\greic\\Downloads\\simple-database\\src\\main\\resources\\files\\database.json");
            FileWriter fileWriter = new FileWriter(file, true);

            ObjectMapper objectMapper = new ObjectMapper();

            SequenceWriter sequenceWriter = objectMapper.writer().writeValuesAsArray(fileWriter);

            sequenceWriter.write(map);
            sequenceWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

   /* public static void writeInFile() throws IOException {

        try {


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        /*byte[] b = json.getGeneric().getBytes();
        fileOutputStream.write(b);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("File writing done. ");
}
    */

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


    public static File getFile() {
        return new File("C:\\Users\\greic\\Downloads\\simple-database\\src\\main\\resources\\files\\database.json");
    }
}
