
import javax.swing.SwingUtilities;
import java.awt.geom.AffineTransform;
import java.sql.*;

public class Main {

    public static void main(String[] args)
    {

        String url = "jdbc:mariadb://localhost:3306/test";
        String user = "root";
        String passwd = "example";


        try {
            Connection cnc = DriverManager.getConnection(url, user, passwd);


            System.out.println("Connexion effective !");
            System.out.println(cnc.isClosed() ? "Fermée" : "Ouverte" );
            System.out.println(cnc.isValid(0) ? "Valide" : "Invalide" );

        } catch (SQLException e)
        {
            System.out.println("Erreur de connexion");
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(()->new Ecran().afficher());
    }

    public static void affichageWarnings(Connection cnx)
    {
        SQLWarning avertissement;
        try
        {
            avertissement=cnx.getWarnings();
            if (avertissement==null)
            {
                System.out.println("il n'y a pas d'avertissement");
            }
            else
            {
                while (avertissement!=null)
                {
                    System.out.println(avertissement.getMessage());
                    System.out.println(avertissement.getSQLState());
                    System.out.println(avertissement.getErrorCode());
                    avertissement=avertissement.getNextWarning();
                }
            }
            cnx.clearWarnings();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void changerDeBaseDeDonnes(Connection cnx) {
        try {
            System.out.println("base actuelle : " + cnx.getCatalog());
            System.out.println("changement de base de données");
            cnx.setCatalog("demo_java_2");
            System.out.println("base actuelle : " + cnx.getCatalog());
        } catch (SQLException e) {
            System.out.println("Problème dans la manipulation des bases de données sur le serveur");
                    e.printStackTrace();
        }
    }

    public static void testLectureSeule(Connection cnx)
    {
        boolean etat;
        try
        {
            etat = cnx.isReadOnly();
            cnx.setReadOnly(!etat);
            if (cnx.isReadOnly() != etat)
            {
                System.out
                        .println("le mode lecture seule est pris en charge par ce pilote");
            }
            else
            {
                System.out
                        .println("le mode lecture seule n'est pas pris en charge par ce pilote");
            }
            cnx.setReadOnly(etat);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void infosBase(Connection cnx)
    {
        ResultSet rs;
        DatabaseMetaData dbmd;
        try
        {
            dbmd=cnx.getMetaData();
            System.out.println("type de base : " +
                    dbmd.getDatabaseProductName());
            System.out.println("version: " +
                    dbmd.getDatabaseProductVersion());
            System.out.println("nom du pilote : " +
                    dbmd.getDriverName());
            System.out.println("version du pilote : " +
                    dbmd.getDriverVersion());
            System.out.println("nom de l\'utilisateur : " +
                    dbmd.getUserName());
            System.out.println("url de connexion : " + dbmd.getURL());
            rs=dbmd.getTables(null,null,"%",null);
            System.out.println("structure de la base");
            System.out.println("base\tschema\tnom table\ttype table");
            while(rs.next())
            {
                for (int i = 1; i <=4 ; i++)
                {
                    System.out.print(rs.getString(i)+"\t");
                }
                System.out.println();
            }
            rs.close();
            rs=dbmd.getProcedures(null,null,"%");
            System.out.println("les procédures stockées");
            System.out.println("base\tschema\tnom procedure");
            while(rs.next())
            {
                for (int i = 1; i <=3 ; i++)
                {
                    System.out.print(rs.getString(i)+"\t");
                }
                System.out.println();
            }
            rs.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}