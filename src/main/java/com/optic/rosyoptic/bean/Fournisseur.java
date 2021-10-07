package com.optic.rosyoptic.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String adresse;
    private String localite;
    private String pays;
    private String siteWeb;
    private String email;
    private String telephone;
    private String fix;
    private String remarques;


    @OneToMany(mappedBy = "fournisseur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<LunetteSoleil> lunetteSoleils ;            //TODO possible null


    @OneToMany(mappedBy = "fournisseur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Verres> verresList ;                       //TODO possible null

    @OneToMany(mappedBy = "fournisseur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Montures> montures ;                        //TODO possible null

    @OneToOne
    private Paiement paiement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFix() {
        return fix;
    }

    public void setFix(String fix) {
        this.fix = fix;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public List<LunetteSoleil> getLunetteSoleils() {
        return lunetteSoleils;
    }

    public void setLunetteSoleils(List<LunetteSoleil> lunetteSoleils) {
        this.lunetteSoleils = lunetteSoleils;
    }

    public List<Verres> getVerresList() {
        return verresList;
    }

    public void setVerresList(List<Verres> verresList) {
        this.verresList = verresList;
    }

    public List<Montures> getMontures() {
        return montures;
    }

    public void setMontures(List<Montures> montures) {
        this.montures = montures;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
}
