public class Run {
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        Point2D p = new Point2D();
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D();
        // Point2D p = new Point2D(50, 60);
        p.setX(x);
        p.setY(y);
        p.afficher();
        p.translater(1, 2);
        p.afficher();

        System.out.println("Nombre de points : " + Point2D.getCompteur());
    }
}
