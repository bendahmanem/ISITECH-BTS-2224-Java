import java.util.Random;

public class Main {



    public static void main(String[] args) {
        int nombreTentatives = 0;
        int nb1, nb2, nb3;
        Random random = new Random();

        // nous allons utiliser la boucle do while
        // pour que le code s'execute au moins une fois
        do {
            nb1 = random.nextInt(1000);
            nb2 = random.nextInt(1000);
            nb3 = random.nextInt(1000);

            nombreTentatives++;

            System.out.println("Tentative n°" + nombreTentatives);
            System.out.println("Valeur de nb1: " + nb1);
            System.out.println("Valeur de nb2: " + nb2);
            System.out.println("Valeur de nb3: " + nb3);


            // == et != sont des opérateurs de comparaison
            // on peut combiner les epxressions booléennes avec les opérateurs logiques
            // && (et) || (ou) ! (non)
        } while ( nb1 % 2 != 0 || nb2 % 2 != 0 || nb3 % 2 == 0 );



    }
}