import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int nombreEssais = 0;
        int nombreMystere;
        int nombreEntre = 0;
        Random rd = new Random();

        nombreMystere = rd.nextInt(1000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre entre 0 et 1000");
        do {
            // recuperation de l'entree clavier
            nombreEntre = sc.nextInt();
            // incrementation du nombre d'essais
            nombreEssais++;
            // verification de la valeur entree
            if (nombreEntre < nombreMystere) {
                System.out.println("C'est plus !");
            } else if (nombreEntre > nombreMystere) {
                System.out.println("C'est moins !");
            } else {
                System.out.println("Bravo, vous avez trouve le nombre mystere en " + nombreEssais + " essais !");
            }
        } while (nombreEntre != nombreMystere);
    }
}