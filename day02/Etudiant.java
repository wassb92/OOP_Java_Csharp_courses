public class Etudiant {
    private String prenom = null;
    private String nom = null;
    private int age = 0;

    private String address = null;

    // Création du constructor
    Etudiant(String nouveauNom, String nouveauPrenom, int nouveauAge) {
        nom = nouveauNom;
        prenom = nouveauPrenom;
        age = nouveauAge;
    }

    // Constructor par défaut sans paramètre
    Etudiant() {
        nom = "Anonymous";
        prenom = "John";
        age = 25;
    }

    // Afficher les attributs de la class
    public void afficher() {
        System.out.println("nom = " + nom);
        System.out.println("prenom = " + prenom);
        System.out.println("age = " + age);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
    }
}
