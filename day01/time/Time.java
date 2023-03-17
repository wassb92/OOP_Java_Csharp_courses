public class Time {
    private int minutes; // le nombre de minutes depuis minuit

    // constructeur pour créer un objet Time avec un nombre de minutes donné
    public Time(int minutes) {
        this.minutes = minutes;
    }

    // méthode pour afficher l'heure stockée sous forme de minutes depuis minuit
    public void afficher() {
        int heure = this.minutes / 60; // calculer le nombre d'heures
        int minute = this.minutes % 60; // calculer le nombre de minutes restantes
        System.out.printf("%02d:%02d", heure, minute);
    }
}
