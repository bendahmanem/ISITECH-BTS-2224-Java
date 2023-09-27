public class Personne {
    private String nom;
    private String prenom;

    private static int nombrePersonnes = 0;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficherNomComplet() {
        System.out.println(this.prenom + " " + this.nom);
    }
}
