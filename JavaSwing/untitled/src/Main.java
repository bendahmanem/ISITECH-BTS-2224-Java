import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        JFrame fenetre;
        fenetre =  new JFrame();
        fenetre.setBounds(0,0, 800, 600);
        fenetre.setTitle("Ma premiere fenetre java Swing");

        // Creation de trois boutons
        JButton b1, b2, b3;
        b1 = new JButton("Bouton 1");
        b2 = new JButton("Bouton 2");
        b3 = new JButton("Bouton 3");

        // Creation d'un conteneur de type JPanel
        JPanel panneau;
        panneau = new JPanel();


        // Ajout des boutons au panneau
        panneau.add(b1);
        panneau.add(b2);
        panneau.add(b3);

        fenetre.getContentPane().add(panneau);


        // Affichage de la fenetre
        fenetre.setVisible(true);
    }
}