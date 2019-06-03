import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Audit {

    private Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    String data = dateFormat.format(date);


    public void persoanaCreata() {
        File file = new File("data\\audit.csv");
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true))) {
            pw.println("Persoana" + "creata" + "," + data);
            pw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void Voluntari() {
        File file = new File("data\\audit.csv");
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true))) {
            pw.println("Voluntari" + "," + data);
            pw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void Conducere() {
        File file = new File("data\\audit.csv");
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true))) {
            pw.println("Conducere" + "," + data);
            pw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void Administratie() {
        File file = new File("data\\audit.csv");
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true))) {
            pw.println("Administratie" + "," + data);
            pw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void persoaneSortate(String tip) {
        File file = new File("data\\audit.csv");
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true))) {
            pw.println("Persoane_" + tip + "_sortate" + "," + data);
            pw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }


    public void printeazaInformatiiPersoane(String path, String nume, String prenume, String CNP, int tip) {
        File file = new File(path);
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true))) {
            pw.println("Nume : " + nume + ",");
            pw.println("Prenume: " + prenume + ",");
            pw.println("cnp: " + CNP + ",");
            pw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    public void printString(String path, String s) {
        File file = new File(path);
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(file, true))) {
            pw.println(s);
            pw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}