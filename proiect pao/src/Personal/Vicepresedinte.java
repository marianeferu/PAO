package Personal;

public class Vicepresedinte extends Conducere implements Isalariu {

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

    public Vicepresedinte(Integer id_birou, String perioada_de_conducere, Integer salariu, String perioada) {
        super(id_birou, perioada_de_conducere);
        this.salariu = salariu;
        this.perioada = perioada;
    }

    public Vicepresedinte(String nume, String prenume, String CNP, String varsta, Integer id_birou, String perioada_de_conducere, Integer salariu, String perioada) {
        super(nume, prenume, CNP, varsta, id_birou, perioada_de_conducere);
        this.salariu = salariu;
        this.perioada = perioada;
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
