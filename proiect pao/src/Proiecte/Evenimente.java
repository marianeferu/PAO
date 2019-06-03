package Proiecte;

import java.util.Scanner;

public class Evenimente {


    private String tip;
    private String locatie_ev;

    public Evenimente(String tip, String locatie_ev) {
        this.tip = tip;
        this.locatie_ev = locatie_ev;
    }

    public Evenimente(Evenimente ev) {

        tip = ev.tip;
        locatie_ev = ev.locatie_ev;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getLocatie_ev() {
        return locatie_ev;
    }

    public void setLocatie_ev(String locatie_ev) {
        this.locatie_ev = locatie_ev;
    }

    public void setEveniment()
    {

        System.out.println("Introduceti tipul de evenimente dorit: ");
        System.out.println("1. Cultural ");
        System.out.println("2. Sportiv ");


        Scanner in =new Scanner(System.in);

        int n = in.nextInt();

        if(n == 1)
        {

            tip = "Cultural";

            System.out.println("1.Casa de cultura \n 2. Dunare.EDU \n 3.Cinematograf ");

            int opt = in.nextInt();

            if (opt == 1) {

                locatie_ev = "Casa de cultura";

            }
            if (opt == 2) {

                locatie_ev = "Dunare.EDU";

            } else {
                locatie_ev = "Cinematograf";
            }
        }

         if(n ==2)
         {
             tip = "Sportiv";

             System.out.println("1. Parcul Central \n 2. Sala Polivalenta ");

             int opt = in.nextInt();

             if (opt == 1) {

                 locatie_ev = "Parcul Central";

             }
             if (opt == 2) {

                 locatie_ev = "Sala Polivalenta " ;

             }

         }

    }

}
