import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFiles {

    public static boolean ErrorHandling(String[] args) {
        if (args.length == 0) {
            System.out.println("Fichier manquant !");
            return true;
        }
        return false;
    }

    public static void ReadFile(String filename) {
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

    public static void main(String[] args) {
        if (ErrorHandling(args))
            return;
        for (String arg : args)
            ReadFile(arg);
    }
}