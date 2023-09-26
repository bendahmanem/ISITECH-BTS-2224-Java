import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        // La classe LocalDate me donne acces a une serie de methodes
        // qui me permet de manipuler des dates.

        LocalDate noel;
        noel = LocalDate.of(2023, 12, 25);

        System.out.println("Noel tombe un " + noel.getDayOfWeek());

        LocalDateTime maintenant;
        maintenant = LocalDateTime.now();

        LocalDate aujourdhui;
        aujourdhui = LocalDate.from(maintenant);
    }
}