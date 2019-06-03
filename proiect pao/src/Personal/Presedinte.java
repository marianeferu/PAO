package Personal;

public class Presedinte extends Conducere implements Isalariu{

    private String adresa;
    private Integer salariu;
    private String perioada;


    @Override
    public void creste_salariu(int marire) {
        salariu = salariu + marire;
    }

    @Override
    public void scade_salariu(int scadere) {
        salariu = salariu - scadere;

    }


    public Presedinte(Integer id_birou, String perioada_de_conducere, String adresa, Integer salariu, String perioada) {
        super(id_birou, perioada_de_conducere);
        this.adresa = adresa;
        this.salariu = salariu;
        this.perioada = perioada;
    }

    public Presedinte(String nume, String prenume, String CNP, String varsta, Integer id_birou, String perioada_de_conducere, String adresa, Integer salariu, String perioada) {
        super(nume, prenume, CNP, varsta, id_birou, perioada_de_conducere);
        this.adresa = adresa;
        this.salariu = salariu;
        this.perioada = perioada;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getSalariu() {
        return salariu;
    }

    public void setSalariu(Integer salariu) {
        this.salariu = salariu;
    }

    public String getPerioada() {
        return perioada;
    }

    public void setPerioada(String perioada) {
        this.perioada = perioada;
    }
}
