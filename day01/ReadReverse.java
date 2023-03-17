import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadReverse {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Fichier manquant !");
            return;
        }
        String filename = args[0];
        try {
            File file = new File(filename);
            Scanner read = new Scanner(file);
            ArrayList<String> lines = new ArrayList<String>();
            while (read.hasNextLine()) {
                String line = read.nextLine();
                lines.add(line);
            }
            read.close();
            Collections.reverse(lines);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}