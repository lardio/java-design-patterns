package fr.diginamic.factory;

public class Tablette extends ObjetConnecte {
    public Tablette(int volt) {
        super(volt);
        this.nom = this.getClass().getSimpleName();
    }
}
