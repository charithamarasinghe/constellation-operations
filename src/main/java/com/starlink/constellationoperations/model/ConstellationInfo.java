package com.starlink.constellationoperations.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "constellation_info")
public class ConstellationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "constellation_id")
    private Integer constellationId;

    @Column(name = "constellation_name")
    private String constellationName;

    @Column(name = "constellation_added_time", nullable = false, updatable = false)
    @CreationTimestamp
    private Date constellationAddedTime = new Date();

    public Integer getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(Integer constellationId) {
        this.constellationId = constellationId;
    }

    public String getConstellationName() {
        return constellationName;
    }

    public void setConstellationName(String constellationName) {
        this.constellationName = constellationName;
    }

    public Date getConstellationAddedTime() {
        return constellationAddedTime;
    }

    public void setConstellationAddedTime(Date constellationAddedTime) {
        this.constellationAddedTime = constellationAddedTime;
    }
}
