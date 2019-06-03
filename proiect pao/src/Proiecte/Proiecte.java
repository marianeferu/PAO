package Proiecte;

public class Proiecte {

String data;
Integer suma_alocata;
String nr_participanti;
String id_coordonator;
String denumire;


    public Proiecte(String data, Integer suma_alocata, String nr_participanti, String id_coordonator, String denumire) {
        this.data = data;
        this.suma_alocata = suma_alocata;
        this.nr_participanti = nr_participanti;
        this.id_coordonator = id_coordonator;
        this.denumire = denumire;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getSuma_alocata() {
        return suma_alocata;
    }

    public void setSuma_alocata(Integer suma_alocata) {
        this.suma_alocata = suma_alocata;
    }

    public String getNr_participanti() {
        return nr_participanti;
    }

    public void setNr_participanti(String nr_participanti) {
        this.nr_participanti = nr_participanti;
    }

    public String getId_coordonator() {
        return id_coordonator;
    }

    public void setId_coordonator(String id_coordonator) {
        this.id_coordonator = id_coordonator;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
}
