public class Bibliotheque {
    private String nom;
    private Livre[] livres;

    public Bibliotheque(String nom, Livre[] livres) {
        this.nom = nom;
        this.livres = livres;
    }

    public void afficherLivreDisponible() {
        for (Livre livre : livres) {
            if (livre.isDisponible()) {
                System.out.println("Le livre " + livre.getTitre() + " de " + livre.getAuteur() + " paru en "
                        + livre.getAnnee() + " est disponible.");
            }
        }
    }

    public void afficherLivreIndisponible() {
        for (Livre livre : livres) {
            if (!livre.isDisponible()) {
                System.out.println("Zut ! Le livre " + livre.getTitre() + " de " + livre.getAuteur() + " paru en "
                        + livre.getAnnee() + " n'est pas disponible pour le moment.");
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public Livre[] getLivres() {
        return livres;
    }
}
