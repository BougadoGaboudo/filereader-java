package Lecteur;

public class FileReader {
    public static void main(String[] args) {
        TxtFileReader txt = new TxtFileReader();
        txt.readFile("test.txt");

        System.out.println("Affichage normal");
        txt.display();
        System.out.println(" ");

        System.out.println("Affichage inverse");
        txt.displayReverse();
        System.out.println(" ");

        System.out.println("Affichage palindrome");
        txt.displayPalindrome();
        System.out.println(" ");

        TxtFileReader txtCopy = new TxtFileReader();
        txtCopy.readFile("testcopy.txt");
        
        System.out.println("Comparaison des 2 TXT");
        System.out.println("Fichiers identiques : " + txt.compare(txtCopy));
        System.out.println(" ");

        CsvFileReader csv = new CsvFileReader();
        csv.readFile("test.csv");

        System.out.println("Affichage normal");
        csv.display();
        System.out.println(" ");

        System.out.println("Affichage inverse");
        csv.displayReverse();
        System.out.println(" ");

        System.out.println("Affichage palindrome");
        csv.displayPalindrome();
        System.out.println(" ");

        CsvFileReader csvCopy = new CsvFileReader();
        csvCopy.readFile("testcopy.csv");
        
        System.out.println("Comparaison des 2 CSV");
        System.out.println("Fichiers identiques : " + csv.compare(csvCopy));
        System.out.println(" ");


        JsonFileReader json = new JsonFileReader();
        json.readFile("test.json");

        System.out.println("Affichage normal");
        json.display();
        System.out.println(" ");

        System.out.println("Affichage inverse");
        json.displayReverse();
        System.out.println(" ");

        System.out.println("Affichage palindrome");
        json.displayPalindrome();
        System.out.println(" ");

        JsonFileReader jsonCopy = new JsonFileReader();
        jsonCopy.readFile("testcopy.json");
        
        System.out.println("Comparaison des 2 JSON");
        System.out.println("Fichiers identiques : " + json.compare(jsonCopy));
        System.out.println(" ");

    }
}