package Lecteur;

import java.io.IOException;

public interface FileReaderInterface {
    void readFile(String filePath) throws IOException;
    void display();
    void displayReverse();
    void displayPalindrome();

    boolean compare(FileReaderInterface fileToCompare);
}