import Personal.Administratie;
import Personal.Conducere;
import Personal.Persoane;
import Personal.Voluntari;
import Proiecte.Evenimente;
import Proiecte.Proiecte;
import Proiecte.Proiecte_Externe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class jdbc {

    private String url = "jdbc:mysql://localhost:3310/proiect";
    private String username = "root";
    private String password = "";

    public jdbc(){
        String  sql1 = "DELETE FROM voluntari";
        String  sql2 = "DELETE FROM proiecte_externe";
        String  sql3 = "DELETE FROM proiecte_locale";
        String  sql4 = "DELETE FROM evenimente";
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s1 = con.prepareStatement(sql1);
                PreparedStatement s2 = con.prepareStatement(sql2);
                PreparedStatement s3 = con.prepareStatement(sql3);
                PreparedStatement s4 = con.prepareStatement(sql4);
        ) {
            s1.executeUpdate();
            s2.executeUpdate();
            s3.executeUpdate();
            s4.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void adaugavoluntar(Integer nr_ore_efectuate,Integer nr_proiecte){
        String  sql = "INSERT INTO voluntari VALUES (?, ?)";

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setInt(1, nr_ore_efectuate);
            s.setInt(2, nr_proiecte);

            s.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void adaugaEvenimente(Evenimente e){
        String  sql = "INSERT INTO evenimente VALUES (?, ?)";
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setString(1, e.getLocatie_ev());
            s.setString(2, e.getTip());


            s.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void adaugaConducere(Conducere c){
        String  sql = "INSERT INTO conducere VALUES (?, ?)";
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setInt(1, c.getId_birou());
            s.setString(2, c.getPerioada_de_conducere());



            s.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void adaugaadministratie(Administratie c){

        String  sql = "INSERT INTO listarespinsi VALUES (?, ?, ?)";
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setString(1, c.getSuma_finantata());
            s.setString(2, c.getZone());
            s.setString(3, c.getLocatii());

            s.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void stergePersoane(Persoane c){
        String  sql = "DELETE FROM persoane WHERE Nume = ? and Prenume = ?";
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setString(1, c.getNume());
            s.setString(2, c.getPrenume());
            s.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stergeProiecte(Proiecte c){
        String  sql = "DELETE FROM proiecte WHERE denumire = ?";
        try (
                Connection con = DriverManager.getConnection(url, username, password);
                PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setString(1, c.getDenumire());

            s.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }










}
