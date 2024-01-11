package Metier;

import java.util.Date;

public class Compte {

    private int code;
    private Date date_cre;
    private double solde ;

    public Compte(int code, Date date_cre, double solde) {
        super();
        this.code = code;
        this.date_cre = date_cre;
        this.solde = solde;
    }
    public Compte(int code, double solde) {
        super();
        this.code = code;
        this.date_cre = new Date();
        this.solde = solde;
    }

    public Compte(int code) {
        super();
        this.code = code;
        this.date_cre = new Date();
        this.solde = 0;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public Date getDate_cre() {
        return date_cre;
    }
    public void setDate_cre(Date date_cre) {
        this.date_cre = date_cre;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Double retireMontant(double montant){
        this.solde = this.solde-montant;
        return this.solde;
    }

    public Double AlimenterCompte(double montant){
        this.solde = this.solde+montant;
        return this.solde;
    }

    @Override
    public String toString() {
        return "compte \n code =" + code + ",\n date_cre =" + date_cre + ",\n solde =" + solde;
    }
}