package Personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persoane {

    protected String nume;
    protected String prenume;
    protected String CNP;
    protected String varsta;


    public Persoane() {
        super();
    }

    public Persoane(String nume, String prenume, String CNP, String varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }
}