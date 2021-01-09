package com.starlink.constellationoperations.model;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "constellation_sat_info")
public class ConstellationSatInfo {
    @Id
    @Column(name = "satellite_id")
    private Integer satelliteId;

//    @ManyToOne
//    @JoinColumn(name = "constellation_id", referencedColumnName="constellation_id", nullable = false)
    @Column(name = "constellation_id")
    private Integer constellationId;

    @Column(name = "added_time")
    @CreationTimestamp
    private Date addedTime = new Date();

    public Integer getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(Integer satelliteId) {
        this.satelliteId = satelliteId;
    }

    public Integer getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(Integer constellationId) {
        this.constellationId = constellationId;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }
}
