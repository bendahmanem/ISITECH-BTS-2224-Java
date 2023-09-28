import java.io.*;
import java.util.ArrayList;

public class Main {

            public static void main(String[] args) {

/*
    String nom = new String("Dupont");
    ArrayList<Livre> liste = new ArrayList<Livre>();

    ListeGenerique<Livre> listeGenerique = new ListeGenerique<Livre>(10);
    Livre LordOfTheRings = new Livre("L1", "Lord of the Rings", 20.0, 123456789, new Personne("Tolkien", "J.R.R."), 100);
    listeGenerique.ajout(LordOfTheRings);
    int nombreDelivres = listeGenerique.getNbElements();
    System.out.println(listeGenerique.getElement(0).getDesignation());

    Article a1 = new Article("A1", "Article 1", 10.0);
    Personne jean = new Personne("Dupont", "Jean");
    Livre l1 = new Livre("L1", "Livre 1", 20.0, 123456789, jean, 100);
*/
    InputStream inputStream = null;

    try {
        File file =  new File("C:\\Users\\julie\\Documents\\Cours\\Java\\TP\\TP2\\src\\articles.txt");

        inputStream = new FileInputStream(file);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } finally {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    }

            public static void LireFichier(String nom)
            {
                // Premier indice : representez le contenu du fichier ligne par ligne....

                // FileinputStream vous permet de lire le fichier octet par octet... a partir du chemin du fichier...

                // Deuxieme indice : utilisez un BufferedReader pour lire le fichier ligne par ligne
                // ou
                // Troisieme indice : utilisez un FileReader pour lire le fichier ligne par ligne




                // Votre code ici
                // BufferedReader
                // FileInputStream
                // InputStreamReader
                // System.out.println
                // FileReader
                // File
            }
}



