package br.simple.database.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DefaultManagementUtils {

    public static Map<String, String> inputInFile(){
        Map<String, String> map = new HashMap<>();
        map.put("cffcb086-95c6-11ee-b9d1-0242ac120002", "Ane");
        map.put("e862c80e-95c6-11ee-b9d1-0242ac120002", "Alice");
        map.put("e862c80e-95c6-11ee-b9d1-0242ac120003", "Guilherme");
        return map;
    }

    public static void writeInFile(Generic<Map<String, String>> map, FileOutputStream fileOutputStream) throws IOException {
        byte[] b = map.getGeneric().toString().getBytes();
        fileOutputStream.write(b);
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("File writing done. ");
    }

    public static File getFile(){
        return new File("C:\\Users\\greic\\Downloads\\simple-database\\src\\main\\resources\\files\\database.json");
    }
}
