public class Point2D {
    int x = 0;
    int y = 0;

    static int compteur = 0;

    static int getCompteur() {
        return Point2D.compteur;
    }

    Point2D() {
        Point2D.compteur++;
    }

    /*
     *
     * Point2D(int x, int y) {
     * this.x = x;
     * this.y = y;
     * }
     */

    void setX(int valX) {
        this.x = valX;
    }

    void setY(int valY) {
        this.y = valY;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    void afficher() {
        System.out.println("[" + this.x + ", " + this.y + "]");
    }

    void translater(int dX, int dY) {
        this.x += dX;
        this.y += dY;
    }
}

/* RUN : */
/*
 * public class Run {
 * public static void main(String[] args) {
 * int x = 6;
 * int y = 7;
 * Point2D p = new Point2D();
 * Point2D p1 = new Point2D();
 * Point2D p2 = new Point2D();
 * // Point2D p = new Point2D(50, 60);
 * p.setX(x);
 * p.setY(y);
 * p.afficher();
 * p.translater(1, 2);
 * p.afficher();
 *
 * System.out.println("Nombre de points : " + Point2D.getCompteur());
 * }
 * }
 */