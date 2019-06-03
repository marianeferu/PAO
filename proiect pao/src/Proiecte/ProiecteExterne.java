package Proiecte;

public class ProiecteExterne extends  Proiecte{


    private String locatie;
    private Integer cheltuieli;   ///transport

    public ProiecteExterne(String data, Integer suma_alocata, String nr_participanti, String id_coordonator, String denumire, String locatie, Integer cheltuieli) {
        super(data, suma_alocata, nr_participanti, id_coordonator, denumire);
        this.locatie = locatie;
        this.cheltuieli = cheltuieli;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public Integer getCheltuieli() {
        return cheltuieli;
    }

    public void setCheltuieli(Integer cheltuieli) {
        this.cheltuieli = cheltuieli;
    }
}
