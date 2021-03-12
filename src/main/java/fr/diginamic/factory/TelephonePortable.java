package fr.diginamic.factory;

public class TelephonePortable extends ObjetConnecte {
    public TelephonePortable(int volt) {
        super(volt);
        this.nom = this.getClass().getSimpleName();
    }
}
