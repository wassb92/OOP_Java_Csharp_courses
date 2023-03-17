import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        double temp = 0;
        String unit = "";
        double convertedTemp;

        if (args.length == 2) {
            temp = Double.parseDouble(args[0]);
            unit = args[1].toLowerCase();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrer la température: ");
            temp = scanner.nextDouble();
            System.out.print("Entrer l'unité (Celsius ou Fahrenheit): ");
            unit = scanner.next().toLowerCase();
            scanner.close();
        }

        if (unit.equals("celsius")) {
            convertedTemp = temp * 9 / 5 + 32;
            System.out.println(temp + " Celsius est équivalent à " + convertedTemp + " Fahrenheit.");
        } else if (unit.equals("fahrenheit")) {
            convertedTemp = (temp - 32) * 5 / 9;
            System.out.println(temp + " Fahrenheit est équivalent à " + convertedTemp + " Celsius.");
        } else {
            System.out.printf("Unité %s non reconnue.\n", unit);
        }
    }
}
