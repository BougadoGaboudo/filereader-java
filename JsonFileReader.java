package Lecteur;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonFileReader extends FileReaderAbstract {
    public void readFile(String filePath){
        content.clear();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            content.addAll(lines);
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier JSON : " + e.getMessage());
        }
    }
}