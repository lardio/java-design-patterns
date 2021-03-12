package fr.diginamic.factory;

public class ObjetConnecte {

    protected Long id;
    protected Integer limiteVolt;
    protected String nom;
    protected String nomTotal;

    public ObjetConnecte(Integer volt){
        this.limiteVolt = volt;
        this.nom = this.getClass().getSimpleName();
        this.nomTotal = this.getClass().getName();
    }

    public ObjetConnecte(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLimiteVolt() {
        return limiteVolt;
    }

    public void setLimiteVolt(Integer limiteVolt) {
        this.limiteVolt = limiteVolt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomTotal() {
        return nomTotal;
    }

    public void setNomTotal(String nomTotal) {
        this.nomTotal = nomTotal;
    }
}
