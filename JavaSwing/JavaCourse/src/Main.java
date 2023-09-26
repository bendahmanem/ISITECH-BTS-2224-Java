import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    static String[] adressesMails;
    static String[] listeFournisseurs;
    static int nombreTotalClients;
    static String[] getListeFournisseursDiff;

    static int yahoo = 0;
    static int gmail = 0;
    static int hotmail = 0;
    
    public static void main(String[] args) {

        System.out.println("resultat" + 4.0 / 10.0 * 100.0);

        // Initialisation du tableau des adresses mails
        adressesMails = new String[10];
        adressesMails[0] = "toto@gmail.com";
        adressesMails[1] = "toto@gmail.com";
        adressesMails[2] = "toto@gmail.com";
        adressesMails[3] = "toto@gmail.com";
        adressesMails[4] = "toto@yahoo.com";
        adressesMails[5] = "toto@yahoo.com";
        adressesMails[6] = "toto@hotmail.com";
        adressesMails[7] = "toto@hotmail.com";
        adressesMails[8] = "toto@hotmail.com";
        adressesMails[9] = "toto@hotmail.com";

        // On parcourt le tableau des adresses mails afin de recuperer la liste des fournisseurs
        for (int i = 0; i < adressesMails.length; i++) {
            // split est un tableau qui contiendra par exemple ["toto", "gmail.com"]
            String[] split = adressesMails[i].split("@");
            String fournisseur = split[1];
            System.out.println(fournisseur);

            // On va comparer la veleur de fournisseur avec celle des fournisseurs connus
            // et incrementer le compteur correspondant
            if (fournisseur.equals("gmail.com")) {
                gmail++;
            } else if (fournisseur.equals("yahoo.com")) {
                yahoo++;
            } else if (fournisseur.equals("hotmail.com")) {
                hotmail++;
            }
        }

    }
}