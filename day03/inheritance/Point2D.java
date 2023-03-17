public class Point2D {
    int x;
    int y;

    static int compteur = 0;

    static int getCompteur() {
        return Point2D.compteur;
    }

    Point2D() {
        this.x = 0;
        this.y = 0;
        Point2D.compteur++;
        // System.out.println("Création d'un point");
    }

    Point2D(int x, int y) {
        this(); // Chainage de constructeurs
        this.x = x;
        this.y = y;
    }

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
