package Personal;

import javax.print.DocFlavor;

public class Voluntari extends Persoane{

   private  Integer nr_ore_efectuate;
   private Integer nr_proiecte;


    public Voluntari(Integer nr_ore_efectuate, Integer nr_proiecte) {
        this.nr_ore_efectuate = nr_ore_efectuate;
        this.nr_proiecte = nr_proiecte;
    }

    public Voluntari(String nume, String prenume, String CNP, String varsta, Integer nr_ore_efectuate, Integer nr_proiecte) {
        super(nume, prenume, CNP, varsta);
        this.nr_ore_efectuate = nr_ore_efectuate;
        this.nr_proiecte = nr_proiecte;
    }


    public Integer getNr_ore_efectuate() {
        return nr_ore_efectuate;
    }

    public void setNr_ore_efectuate(Integer nr_ore_efectuate) {
        this.nr_ore_efectuate = nr_ore_efectuate;
    }

    public Integer getNr_proiecte() {
        return nr_proiecte;
    }

    public void setNr_proiecte(Integer nr_proiecte) {
        this.nr_proiecte = nr_proiecte;
    }
}
