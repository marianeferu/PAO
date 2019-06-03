import Personal.Administratie;
import Personal.Conducere;
import Personal.Persoane;
import Personal.Voluntari;
import Proiecte.Proiecte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Serviciu {

    private List<Persoane> pers = new ArrayList<>();
    private List <Proiecte> pro = new ArrayList<>();



    public void display_menu(){
        System.out.println("1) Adauga o persoana \n2) Adauga un proiect \n ");

    }

    public void afisare_serviciu() {


        Scanner in = new Scanner(System.in);


        Integer optiune;

        do {
            display_menu();
            optiune =  in.nextInt();
            switch (optiune) {

                case 1: {
                    System.out.println("1) Adauga persoana la conducere \n2) Adauga persoana la Administratie \n3)Adauga persoana la Voluntari\n4)Meniul principal ");

                    Integer optiune2 =  in.nextInt();

                    switch (optiune2) {

                        case 1:
                            System.out.println("Am adaugat persoana la conducere ");

                            int id_birou = in.nextInt();
                            String perioada_de_conducere = in.next();

                            pers.add(new Conducere(id_birou,perioada_de_conducere));

                            break;


                        case 2:

                            System.out.println("Am adaugat persoana la Administratie ");

                            String suma_finantata = in.next();
                            String zone= in.next();
                            String locatii= in.next();
                            pers.add(new Administratie(suma_finantata,zone, locatii));

                            break;


                        case 3:

                            System.out.println("Am adaugat persoana la Voluntari ");


                            Integer nr_ore_efectuate = in.nextInt();
                            Integer nr_proiecte = in.nextInt();

                            pers.add(new Voluntari(nr_ore_efectuate,nr_proiecte));


                            break;

                        case 4:
                            System.out.println("Meniul principal\n ");




                    }

                }

                break;


                case 2:

                    System.out.println("Am adaugat un proiect ");
                    String data = in.next();
                    Integer suma_alocata = in.nextInt();
                    String nr_participanti = in.next();
                    String id_coordonator = in.next();
                    String denumire = in.next();

                    pro.add(new Proiecte(data,suma_alocata,nr_participanti,id_coordonator,denumire));

                    break;


                default:
                    System.err.println("Optiune necunoscuta\n ");
                    break;

            }
        }while ( optiune>=1 && optiune<=3);



    }


}
