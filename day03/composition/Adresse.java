public class Adresse {
    private String rue;
    private String ville;
    private int numero;
    private String codePostal;

    public Adresse(String rue, String ville, int numero, String codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.numero = numero;
        this.codePostal = codePostal;
    }

    public String formatee() {
        return numero + " " + rue + ", " + codePostal + " " + ville;
    }
}
