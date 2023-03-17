public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private Adresse adresse;

    public Personne(String nom, String prenom, int age, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
    }

    public void afficherDonnee() {
        System.out.println("Nom: " + nom + "\n" +
                "Prenom: " + prenom + "\n" +
                "Age: " + age + "\n" +
                "Adresse: " + adresse.formatee() + "\n");
    }
}
