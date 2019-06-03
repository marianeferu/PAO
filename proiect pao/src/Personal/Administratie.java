package Personal;

public class Administratie extends Persoane{

    private String suma_finantata;
    private String zone;
    private String locatii;

    public Administratie(String suma_finantata, String zone, String locatii) {
        this.suma_finantata = suma_finantata;
        this.zone = zone;
        this.locatii = locatii;
    }

    public Administratie(String nume, String prenume, String CNP, String varsta, String suma_finantata, String zone, String locatii) {
        super(nume, prenume, CNP, varsta);
        this.suma_finantata = suma_finantata;
        this.zone = zone;
        this.locatii = locatii;
    }

    public String getSuma_finantata() {
        return suma_finantata;
    }

    public void setSuma_finantata(String suma_finantata) {
        this.suma_finantata = suma_finantata;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getLocatii() {
        return locatii;
    }

    public void setLocatii(String locatii) {
        this.locatii = locatii;
    }
}
