package br.simple.database.files;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;

import static br.simple.database.utils.DefaultManagementUtils.getFile;

public class Delete {

    public static void main(String[] args) {

        try{
           /* List<String> collect = Files.lines(
                    getFile().toPath()).filter(
                    line -> {
                        try {
                            return !line.contains(inputInFile());
                        } catch (JsonProcessingException e) {
                            throw new RuntimeException(e);
                        }
                    }).collect(Collectors.toList());

            Files.write(getFile().toPath(), collect, StandardOpenOption.WRITE, StandardOpenOption.DELETE_ON_CLOSE); */


            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(getFile());

            for(JsonNode node : jsonNode){
                ((ObjectNode) node).remove("ccfeeb5e-e60c-465d-84bc-e7d8f3c1ba89");
            }
            objectMapper.writeValue(getFile(), jsonNode);

            System.out.println("Deleting data...");

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
