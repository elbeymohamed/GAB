package modele;
// Generated 2019-09-21 19:37:51 by Hibernate Tools 4.3.1

/**
 * Compte generated by hbm2java
 */
public class Compte {

    private String numcompte;
    private String idClient;
    private String nip;
    private Float solde;
    private String typecompte;
    private Float limiteOperation;

    public Compte(String numcompte, String idClient, String nip, Float solde, String typecompte, Float limiteOperation) {
        this.numcompte = numcompte;
        this.idClient = idClient;
        this.nip = nip;
        this.solde = solde;
        this.typecompte = typecompte;
        this.limiteOperation = limiteOperation;
    }

    public Float getLimiteOperation() {
        return limiteOperation;
    }

    public void setLimiteOperation(Float limiteOperation) {
        this.limiteOperation = limiteOperation;
    }

    public Compte() {
    }

    public String getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(String numcompte) {
        this.numcompte = numcompte;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public Float getSolde() {
        return solde;
    }

    public void setSolde(Float solde) {
        this.solde = solde;
    }

    public String getTypecompte() {
        return typecompte;
    }

    public void setTypecompte(String typecompte) {
        this.typecompte = typecompte;
    }

}
