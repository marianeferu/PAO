package Proiecte;

public class ProiecteLocale extends Proiecte {
    
    private Integer nr_voluntari;

  public Proiecte_Locale(String data, Integer suma_alocata, String nr_participanti, String id_coordonator, String denumire, Integer nr_voluntari, Evenimente ev) {
        super(data, suma_alocata, nr_participanti, id_coordonator, denumire);
        this.nr_voluntari = nr_voluntari;

        evenimente = new Evenimente(ev);


    }

    public Integer getNr_voluntari() {
        return nr_voluntari;
    }

    public void setNr_voluntari(Integer nr_voluntari) {
        this.nr_voluntari = nr_voluntari;
    }
}
