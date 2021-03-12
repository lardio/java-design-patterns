package fr.diginamic.factory;

public class EnceinteConnectee extends ObjetConnecte {

    public EnceinteConnectee(Integer volt) {
        super(volt);
        this.nom = this.getClass().getSimpleName();
    }

    public EnceinteConnectee(){}

}
