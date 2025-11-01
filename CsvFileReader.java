package Lecteur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader extends FileReaderAbstract {
    public void readFile(String filePath){
        content.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null){
                content.add(line);
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier CSV : " + e.getMessage());
        }
    }
}