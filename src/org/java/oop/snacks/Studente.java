package org.java.oop.snacks;

public class Studente {

    private String nome;
    private String cognome;
    private int eta;

    // costruttore

    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // get 

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public int getEta() {
        return this.eta;
    }

    // metodo

    public static String getStudente(String nome, String cognome, int eta) {
        if(nome != null && cognome != null && eta > 2) {
            return nome + " " + cognome + ", " + eta + " anni";
        }
        return null;
    }
}
