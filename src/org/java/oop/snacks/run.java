package org.java.oop.snacks;

import java.math.BigDecimal;
import java.util.Random;

public class run {
    public static void main(String[] args) {
    Random random = new Random();

        // SNACK 1

        // inizializzazione studente tramite costruttore
        Studente carlo = new Studente("Carlo", "Lancelotti", 16);
        Studente Franco = new Studente("Franco", "Rossi", 17);
        Studente Mario = new Studente("Mario", "Verdi", 18);



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

        boolean puoPrelevare = conto.preleva(new BigDecimal(20));

        if(puoPrelevare) {
            System.out.println("Preleva 20$ = " + "Saldo: " + conto.getSaldo() + "$");

            System.out.println("");
        }

        
        else {
            System.out.println("saldo insufficiente per il prelievo richiesto");
        }

        // SNACK 3

        System.out.println("Snack 3");

        // Inizializzazione nuovo registro
        RegistroStudenti registro = new RegistroStudenti();

        registro.addStudente(carlo);
        registro.mostraStudenti();

        System.out.println("");
        
        registro.addStudente(Franco);
        registro.mostraStudenti();

        System.out.println("");

        registro.addStudente(Mario);
        registro.mostraStudenti();

        System.out.println("");
    }
}
