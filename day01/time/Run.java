public class Run {
    public static void main(String[] args) {
        // créer des variables Time avec des valeurs différentes
        Time t1 = new Time(605); // 10:05
        Time t2 = new Time(45); // 00:45

        // afficher la valeur de chaque variable Time
        System.out.print("t1 = ");
        t1.afficher();
        System.out.println();
        System.out.print("t2 = ");
        t2.afficher();
        System.out.println();
    }
}