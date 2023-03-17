public class Run {
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        Point3D p = new Point3D(10, 20, 30);
        Point2D p1 = new Point2D(50, 60);
        p.setX(x);
        p.setY(y);
        p.setZ(40);
        p.afficher();
        p.translater(1, 2);
        p.translater(1, 2, 41);
        p.afficher();

        System.out.println("Nombre de points : " + Point2D.getCompteur());
    }
}
