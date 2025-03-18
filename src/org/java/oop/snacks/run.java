package org.java.oop.snacks;

public class run {
    public static void main(String[] args) {

        // SNACK 1

        // inizializzazione studente tramite costruttore
        Studente carlo = new Studente("Carlo", "Lancelotti", 16);

        // output
        System.out.println("");

        System.out.println("Studente:");
        System.out.println(Studente.getStudente(carlo.getNome(), carlo.getCognome(), carlo.getEta()));

        System.out.println("");
    }
}
