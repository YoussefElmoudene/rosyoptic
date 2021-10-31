package com.optic.rosyoptic.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Mesure implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String distance; // loin pres
    private String oeil; // droite ou gouche
    private double axe;
    private double cyl;
    private double sph;
    private double prisme;
    private Date date;
    @ManyToOne
    private Client client;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getOeil() {
        return oeil;
    }

    public void setOeil(String oeil) {
        this.oeil = oeil;
    }

    public double getAxe() {
        return axe;
    }

    public void setAxe(double axe) {
        this.axe = axe;
    }

    public double getCyl() {
        return cyl;
    }

    public void setCyl(double cyl) {
        this.cyl = cyl;
    }

    public double getSph() {
        return sph;
    }

    public void setSph(double sph) {
        this.sph = sph;
    }

    public double getPrisme() {
        return prisme;
    }

    public void setPrisme(double prisme) {
        this.prisme = prisme;
    }
}
