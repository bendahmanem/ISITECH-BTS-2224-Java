import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

    public class Main {
        private JFrame fenetre;

        public Main(String[] args) {
            this.fenetre = new JFrame("Jeu de la vie");
            this.fenetre.setTitle("Jeu de la vie");
            this.fenetre.setBounds(0, 0, 1000, 1000);
            this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Creation de boutons
            JButton b1, b2, b3;
            b1 = new JButton("Bouton 1");
            b2 = new JButton("Bouton 2");
            b3 = new JButton("Bouton 3");

            // Creation d'un conteneur intermediare
            JPanel panel = new JPanel();


            // Ajout des boutons au conteneur
            panel.add(b1);
            panel.add(b2);
            panel.add(b3);

            this.fenetre.getContentPane().add(panel);
        }

        public void afficher() {
            this.fenetre.setVisible(true);
        }

        public static void main(String[] args) {
          SwingUtilities.invokeLater(() -> new Main(args).afficher());
        }
    }



