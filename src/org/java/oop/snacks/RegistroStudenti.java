package org.java.oop.snacks;

public class RegistroStudenti {

    private static Studente[] studenti;
    private int count = 0; 

    public RegistroStudenti() {
       studenti = new Studente[10];

    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void addStudente(Studente studente) {
        if (count < studenti.length) {
            studenti[count] = studente;
            count++; 
        } else {
            System.out.println("Registro pieno! Impossibile aggiungere altri studenti.");
        }
    }

    public void mostraStudenti() {
        System.out.println("Registro Studenti:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + studenti[i].getNome() + " " + studenti[i].getCognome() + ", età: " + studenti[i].getEta());
        }
    }


}
