package com.example.projetspring;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "Location")
@NamedQueries(
        @NamedQuery( name = "get-all-locations" , query="SELECT s from Location s"
        )
)
public class Location {
    @Id
    @GeneratedValue
    private Long id ;
    @Column(nullable = false)
    private Date dateLocation ;
    @Column
    private Date dateRendu ;

    @OneToMany(mappedBy = "location")
    private List<Velo> Velos ;

    public Long getId() {
        return id;
    }

    public Date getDateLocation() {
        return dateLocation;
    }

    public Date getDateRendu() {
        return dateRendu;
    }

    public void setDateLocation(Date date){
        this.dateLocation = date;
    }

    public void setDateRendu(Date dateRendu) {
        this.dateRendu = dateRendu;
    }

    @Override
    public String toString() {
        return "("+id+") - Location{" + "\n" +
                "   - dateLocation=" + dateLocation + "\n" +
                "   - dateRendu =" + dateRendu + "\n" +
                "   - Velos=" + Velos + "\n" +
                '}';
    }
}