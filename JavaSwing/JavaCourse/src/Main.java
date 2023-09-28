import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    // LireFichier("test.txt");
    LireFichier("/Users/mounirbendahmane/Programmation/Github/ISITECH/BTS-SIO-2022-2024/JAVA/JavaSwing/JavaCourse/src/test.txt");
    lireFichier2("/Users/mounirbendahmane/Programmation/Github/ISITECH/BTS-SIO-2022-2024/JAVA/JavaSwing/JavaCourse/src/nombres.txt");

    }

    public static void LireFichier(String nom) {
        FileInputStream fichier = null;
        BufferedReader tampon = null;
        String ligne = null;

        try {
            fichier = new FileInputStream(nom);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        tampon = new BufferedReader(new InputStreamReader(fichier));

        try {
            ligne = tampon.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        while (ligne != null) {
            System.out.println(ligne);
            try {
                ligne = tampon.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }


    }

    public static void lireFichier2(String nom)
    {
        FileInputStream fichier = null;
        BufferedReader br = null;
        String ligne = null;
        double somme = 0;

        try
        {
            fichier = new FileInputStream(nom);
            br = new BufferedReader(new InputStreamReader(fichier));
            ligne = br.readLine();
            while (ligne != null) {
                System.out.println(ligne);
                ligne = br.readLine();
                if (ligne != null)
                {
                    somme = somme + Double.parseDouble(ligne);
                }
            }
            System.out.println("total : " + somme);
        }
        catch (IOException | NumberFormatException e)
        {
            e.printStackTrace();
        }
    }
}



