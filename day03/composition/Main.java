public class Main {
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse("rue de Paris", "Paris", 24, "75001");
        Adresse adresse2 = new Adresse("rue de la République", "Lyon", 3, "69001");

        Personne personne1 = new Personne("Dupont", "Jean", 30, adresse1);
        Personne personne2 = new Personne("Martin", "Sophie", 25, adresse2);

        personne1.afficherDonnee();
        personne2.afficherDonnee();
    }
}
