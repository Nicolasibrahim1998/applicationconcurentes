package cddc;

/**
 * Exemple de données muttable, 
 * sera partagé entre plusieurs Threads
 *
 * @author Pascal Fares
 */
public class Data {

    private int donnee;


    public Data() {
        setDonnee(0);
    }

    /**
     * Incrémente et modifie la donnée
     */
    public void inc() {
        //1- getData : lire
        //2- +1
        //3- setData : ecrire
        setDonnee(getDonnee() + 1);
    }

    public int getDonnee() {
        return donnee;
    }

    public void setDonnee(int donnee) {
        this.donnee = donnee;
    }
}
