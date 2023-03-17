public class Point3D extends Point2D {
    int z;

    Point3D() {
        super();
        this.z = 0;
    }

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void setZ(int valZ) {
        this.z = valZ;
    }

    void afficher() {
        System.out.println("[" + this.x + " " + this.y + " " + this.z + "]");
    }

    void translater(int dX, int dY, int dZ) {
        this.x += dX;
        this.y += dY;
        this.z += dZ;
    }
}
