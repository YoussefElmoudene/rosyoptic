package com.optic.rosyoptic.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Montures implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marque;
    private String modele;
    private String series;
    private String etat; // vendu ou disponible ** disponible par defaut
    private double price;
    private double priceTotale; // auto calculated for same marques and series
    private double stock; // NB: chaque fois que un monture vendu stock--
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date buyingDate;  // buy ***
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sellingDate; // sell possible null**

    @ManyToOne
    private Fournisseur fournisseur;


    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }


    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public double getPriceTotale() {
        return priceTotale;
    }

    public void setPriceTotale(double priceTotale) {
        this.priceTotale = priceTotale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double prix) {
        this.price = prix;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public Date getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(Date date) {
        this.buyingDate = date;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Date getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(Date date1) {
        this.sellingDate = date1;
    }
}
