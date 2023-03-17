public class Livre {
    private String titre;
    private String auteur;
    private int annee;
    private boolean disponible;

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.disponible = true;
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
        } else {
            System.out.println("Le livre n'est pas disponible pour l'emprunt");
        }
    }

    public void retourner() {
        disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnnee() {
        return annee;
    }

}
