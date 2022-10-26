package banque;

import java.util.ArrayList;
import java.util.List;

public class BanqueV1 {

    private String nom;
    private final List<CompteCourant> comptes = new ArrayList<>();


    public void ajouter(CompteCourant aAjouter){


        // Pour chaque compte
        for (CompteCourant compte : comptes) {
            // je verifie si un compte a deja le numero
            if( compte.getNumero().equals( aAjouter.getNumero() ) ) {
                // si un compte à le même numéro, je pars de la méthode
                return;
            }
        }

        // j'ajoute le compte si pas déjà présent
        comptes.add( aAjouter );
    }


    public void retirer( String numero ){

        // Je parcours les cours
        for (CompteCourant compte : comptes) {
            // si le compte focused a le numero recherché
            if( compte.getNumero().equals( numero ) ){
                // on le supprime
                comptes.remove( compte );
                // et on a fini (pas besoin de verifier les comptes suivants)
                return;
            }
        }

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<CompteCourant> getComptes() {
        return new ArrayList<>( comptes ); // copie la liste
    }
}
