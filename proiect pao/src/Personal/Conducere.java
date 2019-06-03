package Personal;

public class Conducere extends Persoane {

   protected Integer id_birou;
   protected String perioada_de_conducere;

   public Integer getId_birou() {
      return id_birou;
   }

   public void setId_birou(Integer id_birou) {
      this.id_birou = id_birou;
   }

   public String getPerioada_de_conducere() {
      return perioada_de_conducere;
   }

   public void setPerioada_de_conducere(String perioada_de_conducere) {
      this.perioada_de_conducere = perioada_de_conducere;
   }

   public Conducere(Integer id_birou, String perioada_de_conducere) {
      this.id_birou = id_birou;
      this.perioada_de_conducere = perioada_de_conducere;
   }

   public Conducere(String nume, String prenume, String CNP, String varsta, Integer id_birou, String perioada_de_conducere) {
      super(nume, prenume, CNP, varsta);
      this.id_birou = id_birou;
      this.perioada_de_conducere = perioada_de_conducere;
   }
}
