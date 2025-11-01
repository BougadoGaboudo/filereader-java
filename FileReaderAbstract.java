package Lecteur;

import java.util.ArrayList;
import java.util.List;

public abstract class FileReaderAbstract implements FileReaderInterface {
    protected List<String> content = new ArrayList<>();

    public void display(){
        for (String line : this.content){
            System.out.println(line);
        }
    }

    public void displayReverse(){
        for (int i = this.content.size() - 1; i >= 0; i--){
            System.out.println(this.content.get(i));
        }
    }

    public void displayPalindrome(){
        for (String line : this.content){
            String reverse = new StringBuilder(line).reverse().toString();
            System.out.println(reverse);
        }
    }
    
    public boolean compare(FileReaderInterface fileToCompare){
        if (fileToCompare instanceof FileReaderAbstract){
            FileReaderAbstract castedFile = (FileReaderAbstract) fileToCompare;
            return this.content.equals(castedFile.content);
        }
        return false;
    }
}