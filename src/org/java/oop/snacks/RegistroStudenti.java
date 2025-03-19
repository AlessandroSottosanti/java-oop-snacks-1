package org.java.oop.snacks;

public class RegistroStudenti {

    private static Studente[] studenti;
    // private int count = 0; 

    public RegistroStudenti() {
       studenti = new Studente[0];

    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void addStudente(Studente studente) {
        // if (count < studenti.length) {
        //     studenti[count] = studente;
        //     count++; 
        // } else {
        //     System.out.println("Registro pieno! Impossibile aggiungere altri studenti.");
        // }

        Studente[] registro = new Studente[this.studenti.length + 1];

        // copio il vecchio array in quello nuovo e aggiungo il nuovo elemento
        for (int i = 0; i < this.studenti.length; i++) {
            registro[i] = this.studenti[i];
        }

        // aggiungo alla fine dell'array il nuovo oggetto studente
        registro[registro.length - 1] = studente;

        // sovrascrivo il vecchio registro con quello nuovo
        this.studenti = registro;
    }

    public void mostraStudenti() {
         System.out.println("Registro Studenti:");
         for (Studente studente : this.studenti) {
             System.out.println("- " + studente.getNome() + " " + studente.getCognome() + ", età: " + studente.getEta());
         }
    }


}
