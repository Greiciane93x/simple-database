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

                ((ObjectNode) node).remove("87014fef-2cf9-4e57-9956-8f59b8387fc6");
            }
            objectMapper.writeValue(getFile(), jsonNode);





            System.out.println("Deleting data...");

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
