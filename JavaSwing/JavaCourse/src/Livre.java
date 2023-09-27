public class Livre extends Article {

    private int numeroISBN;
    private Personne auteur;

    int nombrePages;



    public Livre(String reference, String designation, double prixHT, int numeroISBN, Personne auteur, int nombrePages)
    {
        // super() is a call to the constructor of the parent class
        super(reference, designation, prixHT);
        this.numeroISBN = numeroISBN;
        this.auteur = auteur;
    }

    public Personne getAuteur() {
        return auteur;
    }
}
