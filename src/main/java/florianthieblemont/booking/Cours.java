package florianthieblemont.booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private int code;
    private String libelle;
    private int nbHeures;
    private int cptHeures;

    public Cours() {
    }

    public Cours(int code, String libelle, int nbHeures) {
        this.code = code;
        this.libelle = libelle;
        this.nbHeures = nbHeures;
        this.cptHeures = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    public int getCptHeures() {
        return cptHeures;
    }

    public void setCptHeures(int cptHeures) {
        this.cptHeures = cptHeures;
    }
}
