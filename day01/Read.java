import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Read {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Fichier manquant !");
            return;
        }
        String filename = args[0];
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Une erreur est survenue.");
            e.printStackTrace();
        }
    }
}