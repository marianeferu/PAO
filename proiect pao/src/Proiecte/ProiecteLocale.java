package Proiecte;

public class ProiecteLocale extends Proiecte {

    private Evenimente evenimente;


    public ProiecteLocale(String data, Integer suma_alocata, String nr_participanti, String id_coordonator, String denumire, Evenimente ev) {
        super(data, suma_alocata, nr_participanti, id_coordonator, denumire);

        evenimente = new Evenimente(ev);


    }
}
