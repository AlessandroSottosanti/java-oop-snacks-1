package org.java.oop.snacks;

import java.math.BigDecimal;
import java.util.Random;

public class run {
    public static void main(String[] args) {
    Random random = new Random();

        // SNACK 1

        // inizializzazione studente tramite costruttore
        Studente carlo = new Studente("Carlo", "Lancelotti", 16);

        // output
        System.out.println("");
        System.out.println("Snack 1");

        System.out.println("Studente:");
        System.out.println(Studente.getStudente(carlo.getNome(), carlo.getCognome(), carlo.getEta()));

        System.out.println("");


        // SNACK 2

        // inizializzazione conto tramite costruttore
        ContoBancario conto = new ContoBancario(random.nextInt(99999));

        System.out.println("Snack 2");

        System.out.println("Numero di conto: " + conto.getNumeroDiConto() + ", Saldo: " + conto.getSaldo() + "$");

        System.out.println("");

        // Deposita

        conto.deposita(new BigDecimal(60));

        System.out.println("Deposita 60$ = " + "Saldo: " + conto.getSaldo() + "$");

        // Preleva

        conto.preleva(new BigDecimal(20));

        System.out.println("Preleva 20$ = " + "Saldo: " + conto.getSaldo() + "$");

    }
}
