package banque;

public class CompteCourant {

    private final String numero;
    private double solde;
    private double ligneCredit;
    private Personne titulaire;

    public CompteCourant(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public CompteCourant(String numero, Personne titulaire, double ligneCredit) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.setLigneCredit( ligneCredit );
    }

    public void depot( double montant ){
        if( montant > 0 )
            solde += montant;
    }

    public void retrait( double montant ){
        if( montant > 0 && solde-montant >= -ligneCredit )
            solde -= montant;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    public double getLigneCredit() {
        return ligneCredit;
    }

    public void setLigneCredit(double ligneCredit) {
        if( ligneCredit >= 0 )
            this.ligneCredit = ligneCredit;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }
}
