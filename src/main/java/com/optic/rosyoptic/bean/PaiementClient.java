package com.optic.rosyoptic.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
public class PaiementClient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date; // date de paiement
    private double montantTotale;
    private double totalPay;
    private double restAPay;
    private double remise;
    private double montantFinale;
    @OneToOne
    private Client client;

    @ManyToMany
    private List<Montures> monturesList;

    @OneToOne
    private Verres verre;

    @ManyToMany
    private List<LunetteSoleil> lunetteList;

    public double getMontantFinale() {
        return montantFinale;
    }

    public void setMontantFinale(double montantFinale) {
        this.montantFinale = montantFinale;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
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

    public double getMontantTotale() {
        return montantTotale;
    }

    public void setMontantTotale(double montantTotale) {
        this.montantTotale = montantTotale;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Montures> getMonturesList() {
        return monturesList;
    }

    public void setMonturesList(List<Montures> monturesList) {
        this.monturesList = monturesList;
    }

    public Verres getVerre() {
        return verre;
    }

    public void setVerre(Verres verre) {
        this.verre = verre;
    }

    public List<LunetteSoleil> getLunetteList() {
        return lunetteList;
    }

    public void setLunetteList(List<LunetteSoleil> lunetteList) {
        this.lunetteList = lunetteList;
    }
}
