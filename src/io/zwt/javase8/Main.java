package io.zwt.javase8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("nashorn");
//
//
//        File f = new File("scripts/readurl.js");
//        Reader reader = new FileReader(f);
//
//        String result;
//        try {
//            result = (String) engine.eval(reader);
//            System.out.println(result);
//        } catch (ScriptException e) {
//            System.out.println("There was a JavaScript error");
//            e.printStackTrace();
//        }
        Path path = FileSystems.getDefault().getPath("scripts", "readurl.js");
        String searchTerm = "contents";

        try (Stream<String> lines = Files.lines(path)) {

            Optional<String> line = lines.filter(l -> l.contains(searchTerm)).findFirst();
            if (line.isPresent()) {
                System.out.println("Found: " + line.get());
            } else {

                System.out.println("Not found");
            }

        } catch (Exception e) {

            System.out.println("There was an error: " + e.getMessage());
        }
    }
}
