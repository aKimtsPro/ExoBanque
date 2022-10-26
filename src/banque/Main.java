package banque;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Personne p = new Personne( "Dubois", "Marie", LocalDate.of(1990, 10, 10) );
        Compte c = new Compte("1", p, 100);

        System.out.println("Solde restant: " + c.getSolde());

        System.out.println("Ajout de 50");
        c.depot( 50 );
        System.out.println("Solde restant: " + c.getSolde());

        System.out.println("Retrait de 100");
        c.retrait( 100 );
        System.out.println("Solde restant: " + c.getSolde());

        System.out.println("Retrait de 80");
        c.retrait( 80 );
        System.out.println("Solde restant: " + c.getSolde());

    }
}