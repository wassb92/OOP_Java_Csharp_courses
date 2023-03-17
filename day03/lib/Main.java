public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("1984", "George Orwell", 1949);
        Livre livre2 = new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954);
        Livre livre3 = new Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", 1997);
        Livre[] livres = { livre1, livre2, livre3 };
        Bibliotheque bibliotheque = new Bibliotheque("Bibliothèque municipale", livres);
        bibliotheque.afficherLivreDisponible();
        livre1.emprunter();
        bibliotheque.afficherLivreDisponible();
        livre1.retourner();
        bibliotheque.afficherLivreDisponible();
        System.out.println("---------------------");
        livre1.emprunter();
        bibliotheque.afficherLivreIndisponible();
    }
}
