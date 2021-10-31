package com.optic.rosyoptic.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Paiement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String libelle;
    private double montantTotale;
    private double totalPay;
    private double restAPay;
    @OneToOne
    private Fournisseur fournisseur;


    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getRestAPay() {
        return restAPay;
    }

    public void setRestAPay(double restAPay) {
        this.restAPay = restAPay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getMontantTotale() {
        return montantTotale;
    }

    public void setMontantTotale(double montant) {
        this.montantTotale = montant;
    }

}
