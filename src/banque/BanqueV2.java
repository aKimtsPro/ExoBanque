package banque;

import java.util.HashMap;
import java.util.Map;

public class BanqueV2 {

    private String nom;
    private final Map<String, CompteCourant> comptes = new HashMap<>();

    public void ajouter(CompteCourant aAjouter){

        if( !comptes.containsKey( aAjouter.getNumero() ) )
            comptes.put( aAjouter.getNumero(), aAjouter );

        // put
        // si la key  exist -> modifie la valeur associée
        // si la key !exist -> inserer la clef et associe la valeur a cette clef
    }

    public void retirer(String numero){
        comptes.remove( numero );
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Map<String, CompteCourant> getComptes() {
        return new HashMap<>(comptes); // retourne un clone de la map
        // et empecher le modif de la map originelle via la ref.
    }
}
