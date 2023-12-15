//package br.simple.database.utils;
//
//import br.simple.database.domain.Details;
//import com.fasterxml.jackson.core.JacksonException;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//
//import java.io.IOException;
//
//public class DetailsSerializer extends JsonDeserializer<Details> {
//    @Override
//    public Details deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
//        if(jsonParser == null) return null;
//
//        Details details = new Details();
//        details.setIdPessoa(String.valueOf(jsonParser.getText()));
//        details.setIdade(String.valueOf(jsonParser.getText()));
//        details.setNome(String.valueOf(jsonParser.getText()));
//
//        return details;
//    }
//}
