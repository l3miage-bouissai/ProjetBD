/*package fr.uga.im2ag.l3.miage.db.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//@Table(name = "Creneau")
public class Creneau {
    @Id
    @GeneratedValue
    private long idCreneau;
    private Date hDebut;
    private Date hFin;
   // private Statut typeStation;

    @ManyToOne
    private Station station;

    public Date gethDebut() {
        return hDebut;
    }



    public long getIdCreneau() {
        return idCreneau;
    }



    public void setIdCreneau(long idCreneau) {
        this.idCreneau = idCreneau;
    }



    public void sethDebut(Date hDebut) {
        this.hDebut = hDebut;
    }

    public Date gethFin() {
        return hFin;
    }

    public void sethFin(Date hFin) {
        this.hFin = hFin;
    }

    public Enums.TypeStation getTypeStation() {
        return typeStation;
    }

    public void setTypeStation(Enums.TypeStation typeStation) {
        this.typeStation = typeStation;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

}*/