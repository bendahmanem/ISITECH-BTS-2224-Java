public class Dvd extends Article{
    private int duree;
    private String realisateur;
    public Dvd(String reference, String designation, double prixHT, int duree, String realisateur) {
        super(reference, designation, prixHT);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public String getRealisateur() {
        return realisateur;
    }
}
